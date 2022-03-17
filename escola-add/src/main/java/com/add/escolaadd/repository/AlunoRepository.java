package com.add.escolaadd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.add.escolaadd.entity.Aluno;

@Repository
@Transactional
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
	Aluno findById(int id);

}
