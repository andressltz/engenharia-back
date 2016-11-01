package br.feevale.engenharia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.springframework.data.domain.Persistable;

@Entity
public class Funcionario implements Serializable, Persistable<Long> {

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private Long idfuncionario;
	
	@JoinColumn 
	private Projeto projeto;
	
	private String nome;
	
	
	
	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public Long getId() {
		return idfuncionario;
	}
	
	public void setIdfuncionario(Long idfuncionario) {
		this.idfuncionario = idfuncionario;
	}

	@Override
	public boolean isNew() {
		return idfuncionario == null;
	}

}
