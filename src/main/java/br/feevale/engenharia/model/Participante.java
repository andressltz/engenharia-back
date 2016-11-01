package br.feevale.engenharia.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.springframework.data.domain.Persistable;

@Entity
public class Participante implements Serializable, Persistable<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idparticipante;
	
	@JoinColumn
	private Projeto projeto;
	private Double cargahoraria;
	
	private LocalDate datainico;
	private LocalDate datafim;
	
	private Situacao situacao;
//	private Nome nome;
//	private Tipo tipo;
	
	
	@Override
	public Long getId() {
		return idparticipante;
	}
	
	public void setIdparticipante(Long idparticipante) {
		this.idparticipante = idparticipante;
	}
	
	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Double getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(Double cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	public LocalDate getDatainico() {
		return datainico;
	}

	public void setDatainico(LocalDate datainico) {
		this.datainico = datainico;
	}

	public LocalDate getDatafim() {
		return datafim;
	}

	public void setDatafim(LocalDate datafim) {
		this.datafim = datafim;
	}

	@Override
	public boolean isNew() {
		return idparticipante == null;
	}

}
