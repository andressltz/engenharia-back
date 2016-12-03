package br.feevale.engenharia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.mail.EmailCompose;
import br.feevale.engenharia.mail.EmailService;
import br.feevale.engenharia.model.Usuario;
import br.feevale.engenharia.repository.UsuarioRepository;

@Component
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private EmailService mailService;

	@Autowired
	private EmailCompose compose;

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

	public Usuario findByUsuarioOrEmail(Usuario usuario) {
		return repository.findByUsuarioOrEmail(usuario.getUsuario());
	}

	public void sendEmailRecuperacaoSenha(Usuario usuario) {
		mailService.enviaEmail(usuario.getEmail(), "Recuperação de Senha", compose.getRecoverPasswordBody(usuario.getNome(), usuario.getSenha()));
	}

	public Usuario findByUsuarioOrEmailAndSenha(Usuario usuario) {
		return repository.findByUsuarioOrEmailAndSenha(usuario.getUsuario(), usuario.getSenha());
	}
}
