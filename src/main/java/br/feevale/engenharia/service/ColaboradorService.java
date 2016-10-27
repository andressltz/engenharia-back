package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Colaborador;
import br.feevale.engenharia.repository.ColaboradorRepository;

@Component
public class ColaboradorService {

	@Autowired
	private ColaboradorRepository repository;
	
	public Colaborador save(Colaborador model){
		return repository.saveAndFlush(model);
	}
	
	public Colaborador findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<Colaborador> findAll() {
		return repository.findAll();
	}
}
