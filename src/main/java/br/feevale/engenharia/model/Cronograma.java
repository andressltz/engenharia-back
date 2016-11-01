package br.feevale.engenharia.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.springframework.data.domain.Persistable;

@Entity
public class Cronograma implements Serializable, Persistable<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idcronograma;
	
	@JoinColumn
	private Projeto projeto;
	
	private String descricao;
	private LocalDate datainicio;
	private LocalDate datafim;
	
	
	@Override
	public Long getId() {
		return idcronograma;
	}
	
	public void setIdcronograma(Long idcronograma) {
		this.idcronograma = idcronograma;
	}
	
	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(LocalDate datainicio) {
		this.datainicio = datainicio;
	}

	public LocalDate getDatafim() {
		return datafim;
	}

	public void setDatafim(LocalDate datafim) {
		this.datafim = datafim;
	}

	@Override
	public boolean isNew() {
		return idcronograma == null;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
