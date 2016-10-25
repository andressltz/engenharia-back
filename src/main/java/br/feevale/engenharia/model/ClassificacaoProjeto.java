package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class ClassificacaoProjeto extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idclassificacaoprojeto;
	
	private String descricao;
	
	@Override
	public Long getId() {
		return idclassificacaoprojeto;
	}

	public Long getIdclassificacaoprojeto() {
		return idclassificacaoprojeto;
	}

	public void setIdclassificacaoprojeto(Long idclassificacaoprojeto) {
		this.idclassificacaoprojeto = idclassificacaoprojeto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
