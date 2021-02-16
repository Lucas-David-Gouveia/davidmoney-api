package com.david.davidmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.davidmoney.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
}