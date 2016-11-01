package br.feevale.engenharia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.springframework.data.domain.Persistable;

@Entity
public class Classificacao implements Serializable, Persistable<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idclassificao;
	
	@JoinColumn
	private Projeto projeto;
	
	private String descricao;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
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

	@Override
	public Long getId() {
		return idclassificao;
	}

	@Override
	public boolean isNew() {
		return idclassificao == null;
	}

}
