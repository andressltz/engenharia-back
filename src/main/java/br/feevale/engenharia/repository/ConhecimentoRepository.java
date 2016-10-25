package br.feevale.engenharia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.feevale.engenharia.model.Conhecimento;

public interface ConhecimentoRepository extends JpaRepository<Conhecimento, Long>{

}
