package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.PublicoAtendido;
import br.feevale.engenharia.repository.PublicoAtendidoRepository;

@Component
public class PublicoAtendidoService {

	@Autowired
	private PublicoAtendidoRepository repository;
	
	public void save(PublicoAtendido model){
		repository.saveAndFlush(model);
	}
	
	public PublicoAtendido findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<PublicoAtendido> findAll() {
		return repository.findAll();
	}
}
