package br.feevale.engenharia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.domain.Persistable;

@Entity
public class Aluno implements Serializable, Persistable<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
//	@Column(name = "idAluno")
	private Long idAluno;
	
	private String nome;

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public Long getId() {
		return idAluno;
	}

	@Override
	public boolean isNew() {
		return null == getId();
	}
	
	

}
