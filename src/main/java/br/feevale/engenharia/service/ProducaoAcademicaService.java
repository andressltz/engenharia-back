package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.ProducaoAcademica;
import br.feevale.engenharia.repository.ProducaoAcademicaRepository;

@Component
public class ProducaoAcademicaService {

	@Autowired
	private ProducaoAcademicaRepository repository;
	
	public ProducaoAcademica save(ProducaoAcademica model){
		return repository.saveAndFlush(model);
	}
	
	public ProducaoAcademica findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<ProducaoAcademica> findAll() {
		return repository.findAll();
	}
}
