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

import com.add.escolaadd.entity.Endereco;
import com.add.escolaadd.repository.EnderecoRepository;

import io.swagger.v3.oas.annotations.Operation;

@Controller
@RequestMapping("/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepo;
	
	@PostMapping("/create")
	@Operation(description = "Este método insere um novo endereço")
	public @ResponseBody Endereco createEndereco(@Validated Endereco endereco) {
		enderecoRepo.save(endereco);
		return endereco;
	}
	
	@GetMapping("/all")
	@Operation(description = "Este método retorna todos os endereços cadastrados")
	public Iterable<Endereco> getAllEndereco() {
		return enderecoRepo.findAll();
	}
	
	@GetMapping(path = "/{id}")
	@Operation(description = "Este método retorna o endereço de acordo com ID")
	public Optional<Endereco> getByIdEndereco(@PathVariable int id) {
		return enderecoRepo.findById(id);
	}
	
	@PutMapping("/update")
	@Operation(description = "Este método altera dados de um endereço cadastrado")
	public @ResponseBody Endereco updateEndereco(@Validated Endereco endereco) {
		enderecoRepo.save(endereco);
		return endereco;
	}
	
	@DeleteMapping(path = "/delete/{id}")
	@Operation(description = "Este método remove um endereço")
	public void removeEndereco(@PathVariable int id) {
		enderecoRepo.deleteById(id);
	}

}
