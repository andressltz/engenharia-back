package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Projeto;
import br.feevale.engenharia.repository.ProjetoRepository;

@Component
public class ProjetoService {

	@Autowired
	private ProjetoRepository repository;
	
	public Projeto save(Projeto model){
		return repository.saveAndFlush(model);
	}
	
	public Projeto findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<Projeto> findAll() {
		return repository.findAll();
	}
}
