package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class Publico extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idpublico;
	
	private String descricao;
	
	@Override
	public Long getId() {
		return idpublico;
	}
	
	public Long getIdpublico() {
		return idpublico;
	}

	public void setIdpublico(Long idpublico) {
		this.idpublico = idpublico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
