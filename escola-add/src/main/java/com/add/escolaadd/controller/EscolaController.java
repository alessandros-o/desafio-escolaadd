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

import com.add.escolaadd.entity.Escola;
import com.add.escolaadd.repository.EscolaRepository;

import io.swagger.v3.oas.annotations.Operation;

@Controller
@RequestMapping("/escola")
public class EscolaController {
	
	@Autowired
	private EscolaRepository escolaRepo;
	
	@PostMapping("/create")
	@Operation(description = "Este método cria uma nova escola")
	public @ResponseBody Escola createEscola(@Validated Escola escola) {
		escolaRepo.save(escola);
		return escola;
	}
	
	@GetMapping
	@Operation(description = "Este método retorna todas as escolas cadastradas")
	public Iterable<Escola> getAllEscola() {
		return escolaRepo.findAll();
	}
	
	@GetMapping(path = "/{id}")
	@Operation(description = "Este método retorna uma escola de acordo com ID")
	public Optional<Escola> getByIdEscola(@PathVariable int id) {
		return escolaRepo.findById(id);
	}
	
	@PutMapping("/update")
	@Operation(description = "Este método altera dados de uma escola cadastrada")
	public @ResponseBody Escola updateEscola(@Validated Escola escola) {
		escolaRepo.save(escola);
		return escola;
	}
	
	@DeleteMapping(path = "/delete/{id}")
	@Operation(description = "Este método remove uma escola")
	public void removeEscola(@PathVariable int id) {
		escolaRepo.deleteById(id);
	}
	
	

}
