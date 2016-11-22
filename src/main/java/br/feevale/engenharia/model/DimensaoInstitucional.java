package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class DimensaoInstitucional extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long iddimensaoinstitucional;
	
	@JoinColumn
	private Projeto projeto;
	
	private String descricao;
	
	@Override
	public Long getId() {
		return iddimensaoinstitucional;
	}
	
	public Long getIddimensaoinstitucional() {
		return iddimensaoinstitucional;
	}

	public void setIddimensaoinstitucional(Long iddimensaoinstitucional) {
		this.iddimensaoinstitucional = iddimensaoinstitucional;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

}
