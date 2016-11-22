package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.InstitutoAcademico;
import br.feevale.engenharia.repository.InstitutoAcademicoRepository;

@Component
public class InstitutoAcademicoService {

	@Autowired
	private InstitutoAcademicoRepository repository;
	
	public InstitutoAcademico save(InstitutoAcademico model){
		return repository.saveAndFlush(model);
	}
	
	public InstitutoAcademico findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<InstitutoAcademico> findAll() {
		return repository.findAll();
	}
}
