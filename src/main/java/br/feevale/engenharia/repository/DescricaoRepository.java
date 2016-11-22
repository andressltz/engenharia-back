package br.feevale.engenharia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.feevale.engenharia.model.Descricao;

public interface DescricaoRepository extends JpaRepository<Descricao, Long> {

}
