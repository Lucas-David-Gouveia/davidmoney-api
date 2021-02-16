package com.david.davidmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.davidmoney.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
}