package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.PublicoAlvo;
import br.feevale.engenharia.repository.PublicoAlvoRepository;

@Component
public class PublicoAlvoService {

	@Autowired
	private PublicoAlvoRepository repository;
	
	public PublicoAlvo save(PublicoAlvo model){
		return repository.saveAndFlush(model);
	}
	
	public PublicoAlvo findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<PublicoAlvo> findAll() {
		return repository.findAll();
	}
}
