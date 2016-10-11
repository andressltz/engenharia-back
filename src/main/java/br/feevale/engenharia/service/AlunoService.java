package br.feevale.engenharia.service;

import java.util.ArrayList;
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
		if (model.isNew()) {
			repository.flush();
//			repository.save(model.getNome());
			repository.save(model);
		} else {
//			update(model);
			repository.save(model);
		}
	}
	
	public void update(Aluno model) { 
//		return repository.update(model.getNome(), model.getIdAluno());
	}
	
	public void delete(Long idAluno) {
		
	}
	
	public List<Aluno> findAll() {
//		return repository.findAll();
		return new ArrayList<>();
	}
	
}
