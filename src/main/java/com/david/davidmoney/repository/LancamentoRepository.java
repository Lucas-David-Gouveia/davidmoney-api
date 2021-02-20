package com.david.davidmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.davidmoney.model.Lancamento;
import com.david.davidmoney.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}