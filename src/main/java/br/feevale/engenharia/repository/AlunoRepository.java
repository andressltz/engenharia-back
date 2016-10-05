package br.feevale.engenharia.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.model.Aluno;

@Component
public interface AlunoRepository extends Repository<Aluno, Long>{

	@Query(value = "INSERT INTO Aluno (nome) VALUES (:nome)", nativeQuery = true)
	void save(@Param("nome")String nome);
	
}
