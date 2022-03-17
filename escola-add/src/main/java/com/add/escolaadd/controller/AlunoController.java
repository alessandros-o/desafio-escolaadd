package com.add.escolaadd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.add.escolaadd.entity.Aluno;
import com.add.escolaadd.repository.AlunoRepository;

import io.swagger.v3.oas.annotations.Operation;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepo;

	@GetMapping("/listaAlunos")
	@Operation(description = "Este método retorna todos os alunos")
	public String getAllAluno(Model model) {
		List<Aluno> aluno = (List<Aluno>) alunoRepo.findAll();
		model.addAttribute("aluno", aluno);
		return "aluno";
	}

	@GetMapping("/cadastroAluno")
	@Operation(description = "Este método retorna o formulário para cadastro de novo aluno")
	public String newAluno(@ModelAttribute("aluno") Aluno aluno) {
		return "form";
	}

	@PostMapping("/cadastroAluno/salvar")
	@Operation(description = "Este método cria um novo aluno e também altera um aluno cadastrado")
	public String createAndUpdateAluno(Aluno aluno) {
		alunoRepo.save(aluno);
		return "redirect:/aluno/listaAlunos";
	}

	@GetMapping("/cadastroAluno/{id}")
	@Operation(description = "Este método retorna um aluno de acordo com id ao ser clicado no botão correspondente")
	public String getByIdAluno(@PathVariable("id") int id, Model model) {
		Optional<Aluno> aluno = Optional.of(alunoRepo.findById(id));

		if (aluno.isEmpty()) {
			throw new IllegalArgumentException("Pessoa inválida.");
		}
		model.addAttribute("aluno", aluno.get());

		return "form";
	}

	@RequestMapping("/deletar")
	@Operation(description = "Este método remove um aluno de acodo com id")
	public String removeAluno(int id) {
		Aluno aluno = alunoRepo.findById(id);
		alunoRepo.delete(aluno);
		return "redirect:/aluno/listaAlunos";
	}

}
