package br.feevale.engenharia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.domain.Persistable;

@Entity
public class Aluno implements Serializable, Persistable<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idaluno;
	
	private String nome;

	public Long getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(Long idaluno) {
		this.idaluno = idaluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public Long getId() {
		return idaluno;
	}

	@Override
	public boolean isNew() {
		return null == getId();
	}
	
	

}
