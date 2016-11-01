package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class ProducaoAcademica extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idproducaoacademica;
	
	private String descricao;
	
	@Override
	public Long getId() {
		return idproducaoacademica;
	}
	
	public Long getIdproducaoacademica() {
		return idproducaoacademica;
	}

	public void setIdproducaoacademica(Long idproducaoacademica) {
		this.idproducaoacademica = idproducaoacademica;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
