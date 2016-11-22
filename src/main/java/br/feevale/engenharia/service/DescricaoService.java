package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Descricao;
import br.feevale.engenharia.repository.DescricaoRepository;

@Component
public class DescricaoService {

	@Autowired
	private DescricaoRepository repository;
	
	public Descricao save(Descricao model){
		return repository.saveAndFlush(model);
	}
	
	public Descricao findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<Descricao> findAll() {
		return repository.findAll();
	}
	
}
