package com.david.davidmoney.repository.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class LancamentoFilter {

	private String descricao;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataVencimentoDe;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataVencimentoAte;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getDataVencimentoDe() {
		return dataVencimentoDe;
	}
	
	public void setDataVencimentoDe(LocalDate dataVencimentoDe) {
		this.dataVencimentoDe = dataVencimentoDe;
	}
	
	public LocalDate getDataVencimentoAte() {
		return dataVencimentoAte;
	}
	
	public void setDataVencimetoAte(LocalDate dataVencimentoAte) {
		this.dataVencimentoAte = dataVencimentoAte;
	}
}
