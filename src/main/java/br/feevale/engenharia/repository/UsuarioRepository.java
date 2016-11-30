package br.feevale.engenharia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.feevale.engenharia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

//	Usuario findByUsuarioOrEmail(String usuario);

//	Usuario findByUsuarioOrEmailAndSenha(String usuario, String senha);

}
