package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Aluno;
import br.feevale.engenharia.repository.AlunoRepository;

@Component
public class AlunoService {

	@Autowired
	private AlunoRepository repository;
	
	public void save(Aluno model){
		repository.saveAndFlush(model);
	}
	
	public Aluno findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long idAluno) {
		repository.delete(idAluno);
	}
	
	public List<Aluno> findAll() {
		return repository.findAll();
	}
	
}
