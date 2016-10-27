package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class Aluno extends BaseModel {
	
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

}
