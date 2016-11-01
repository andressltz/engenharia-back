package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class RecursoHumano extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idrecursohumano;
	
	private String descricao;
	
	@Override
	public Long getId() {
		return idrecursohumano;
	}

	public Long getIdrecursohumano() {
		return idrecursohumano;
	}

	public void setIdrecursohumano(Long idrecursohumano) {
		this.idrecursohumano = idrecursohumano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
