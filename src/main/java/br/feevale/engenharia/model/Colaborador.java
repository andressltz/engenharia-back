package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class Colaborador extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idcolaborador;
	
	private String descricao;
	
	@Override
	public Long getId() {
		return idcolaborador;
	}
	
	public Long getIdcolaborador() {
		return idcolaborador;
	}

	public void setIdcolaborador(Long idcolaborador) {
		this.idcolaborador = idcolaborador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
