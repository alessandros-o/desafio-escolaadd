package com.add.escolaadd.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.add.escolaadd.entity.Turma;
import com.add.escolaadd.repository.TurmaRepository;

import io.swagger.v3.oas.annotations.Operation;

@Controller
@RequestMapping("/turma")
public class TurmaController {
	
	@Autowired
	private TurmaRepository turmaRepo;
	
	@PostMapping("/create")
	@Operation(description = "Este método cria uma nova turma")
	public @ResponseBody Turma createTurma(@Validated Turma turma) {
		turmaRepo.save(turma);
		return turma;
	}
	
	@GetMapping("/all")
	@Operation(description = "Este método retorna todas as turmas cadastradas")
	public Iterable<Turma> getAllTurma() {
		return turmaRepo.findAll();
	}
	
	@GetMapping(path = "/{id}")
	@Operation(description = "Este método retorna a turma de acordo com ID")
	public Optional<Turma> getByIdTurma(@PathVariable int id) {
		return turmaRepo.findById(id);
	}
	
	@PutMapping("/update")
	@Operation(description = "Este método altera dados de uma turma cadastrada")
	public @ResponseBody Turma updateTurma(@Validated Turma turma) {
		turmaRepo.save(turma);
		return turma;
	}
	
	@DeleteMapping(path = "/delete/{id}")
	@Operation(description = "Este método remove uma turma")
	public void removeTurma(@PathVariable int id) {
		turmaRepo.deleteById(id);
	}

}
