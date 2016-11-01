package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Usuario;
import br.feevale.engenharia.repository.UsuarioRepository;

@Component
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario save(Usuario model){
		return repository.saveAndFlush(model);
	}
	
	public Usuario findById(Long id){
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public List<Usuario> findAll() {
		return repository.findAll();
	}
}
