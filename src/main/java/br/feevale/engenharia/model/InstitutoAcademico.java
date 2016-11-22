package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class InstitutoAcademico extends BaseModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idinstitutoacademico;
	
	private String descricao;
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public Long getId() {
		return idinstitutoacademico;
	}

	public void setIdinstitutoacademico(Long idinstitutoacademico) {
		this.idinstitutoacademico = idinstitutoacademico;
	}
	

}
