package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Conhecimento;
import br.feevale.engenharia.repository.ConhecimentoRepository;

@Component
public class ConhecimentoService {

	@Autowired
	private ConhecimentoRepository repository;
	
	public Conhecimento save(Conhecimento model){
		return repository.saveAndFlush(model);
	}
	
	public Conhecimento findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<Conhecimento> findAll() {
		return repository.findAll();
	}
}
