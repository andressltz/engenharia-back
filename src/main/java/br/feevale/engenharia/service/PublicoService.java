package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Publico;
import br.feevale.engenharia.repository.PublicoRepository;

@Component
public class PublicoService {

	@Autowired
	private PublicoRepository repository;
	
	public void save(Publico model){
		repository.saveAndFlush(model);
	}
	
	public Publico findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<Publico> findAll() {
		return repository.findAll();
	}
}
