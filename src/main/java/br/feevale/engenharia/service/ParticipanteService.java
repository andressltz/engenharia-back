package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Participante;
import br.feevale.engenharia.repository.ParticipanteRepository;

@Component
public class ParticipanteService {

	@Autowired
	private ParticipanteRepository repository;
	
	public Participante save(Participante model){
		return repository.saveAndFlush(model);
	}
	
	public Participante findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<Participante> findAll() {
		return repository.findAll();
	}
}
