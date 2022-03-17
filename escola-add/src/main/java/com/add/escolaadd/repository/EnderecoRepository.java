package com.add.escolaadd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.add.escolaadd.entity.Endereco;

@Repository
@Transactional
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>  {
	
	

}
