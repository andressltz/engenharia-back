package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class Conhecimento extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idconhecimento;
	
	private String descricao;
	
	@Override
	public Long getId() {
		return idconhecimento;
	}
	
	public Long getIdconhecimento() {
		return idconhecimento;
	}

	public void setIdconhecimento(Long idconhecimento) {
		this.idconhecimento = idconhecimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
