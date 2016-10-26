package br.feevale.engenharia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.feevale.engenharia.model.Cronograma;

public interface CronogramaRepository extends JpaRepository<Cronograma, Long>{

}
