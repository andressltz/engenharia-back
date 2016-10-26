package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Cronograma;
import br.feevale.engenharia.repository.CronogramaRepository;

@Component
public class CronogramaService {

	@Autowired
	private CronogramaRepository repository;
	
	public void save(Cronograma model){
		repository.saveAndFlush(model);
	}
	
	public Cronograma findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<Cronograma> findAll() {
		return repository.findAll();
	}
}
