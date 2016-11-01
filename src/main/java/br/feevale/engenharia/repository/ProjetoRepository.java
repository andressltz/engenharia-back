package br.feevale.engenharia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.feevale.engenharia.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long>{

}
