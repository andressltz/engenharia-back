package br.feevale.engenharia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.feevale.engenharia.model.Aluno;

/**
 * References: http://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.core-concepts 
 */
//@Component
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

//	@Query(value = "INSERT INTO aluno (nome) VALUES (:nome)", nativeQuery = true)
//	Aluno save(@Param("nome")String nome);
	
//	@Modifying
//	@Query(value = "UPDATE aluno SET nome = :nome WHERE idAluno = :idAluno", nativeQuery = true)
//	int update(@Param("nome")String nome, @Param("idAluno")Long idAluno);
	
}
