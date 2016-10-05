package br.feevale.engenharia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Aluno;
import br.feevale.engenharia.repository.AlunoRepository;

@Component
public class AlunoService {

	@Autowired
	private AlunoRepository repository;
	
	public void save(Aluno model){
		repository.save(model.getNome());
	}
	
	public void atualiza(Aluno model) { 
		
	}
	
	public void remove(Long idAluno) {
		
	}
	
}
