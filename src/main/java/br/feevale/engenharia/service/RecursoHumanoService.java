package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.RecursoHumano;
import br.feevale.engenharia.repository.RecursoHumanoRepository;

@Component
public class RecursoHumanoService {

	@Autowired
	private RecursoHumanoRepository repository;
	
	public RecursoHumano save(RecursoHumano model){
		return repository.saveAndFlush(model);
	}
	
	public RecursoHumano findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<RecursoHumano> findAll() {
		return repository.findAll();
	}
}
