package br.feevale.engenharia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.feevale.engenharia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Query(nativeQuery=true, value = "SELECT * FROM usuario WHERE nome = :usuario OR email = :usuario LIMIT 1")
	Usuario findByUsuarioOrEmail(@Param("usuario") String usuario);

	@Query(nativeQuery=true, value = "SELECT * FROM usuario WHERE (nome = :usuario OR email = :usuario) AND senha = :senha LIMIT 1")
	Usuario findByUsuarioOrEmailAndSenha(@Param("usuario") String usuario, @Param("senha") String senha);

}
