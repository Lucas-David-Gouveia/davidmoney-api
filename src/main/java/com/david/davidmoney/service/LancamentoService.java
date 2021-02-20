package com.david.davidmoney.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.davidmoney.model.Lancamento;
import com.david.davidmoney.model.Pessoa;
import com.david.davidmoney.repository.LancamentoRepository;
import com.david.davidmoney.repository.PessoaRepository;
import com.david.davidmoney.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		
		Pessoa pessoa = pessoaRepository.getOne(lancamento.getPessoa().getCodigo());
		
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepository.save(lancamento);
	}
}