package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Recurso;
import br.feevale.engenharia.repository.RecursoRepository;

@Component
public class RecursoService {

	@Autowired
	private RecursoRepository repository;
	
	public void save(Recurso model){
		repository.saveAndFlush(model);
	}
	
	public Recurso findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<Recurso> findAll() {
		return repository.findAll();
	}
}
