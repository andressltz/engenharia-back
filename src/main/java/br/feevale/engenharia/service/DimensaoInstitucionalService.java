package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.DimensaoInstitucional;
import br.feevale.engenharia.repository.DimensaoInstitucionalRepository;

@Component
public class DimensaoInstitucionalService {

	@Autowired
	private DimensaoInstitucionalRepository repository;
	
	public DimensaoInstitucional save(DimensaoInstitucional model){
		return repository.saveAndFlush(model);
	}
	
	public DimensaoInstitucional findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<DimensaoInstitucional> findAll() {
		return repository.findAll();
	}
}
