package com.add.escolaadd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.add.escolaadd.entity.Turma;

@Repository
@Transactional
public interface TurmaRepository extends JpaRepository<Turma, Integer>{

}
