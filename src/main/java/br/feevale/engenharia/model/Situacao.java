package br.feevale.engenharia.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.feevale.engenharia.base.BaseModel;

public class Situacao extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idsituacao;
	
	@Override
	public Long getId() {
		return idsituacao;
	}
	
	public void setIdsituacao(Long idsituacao) {
		this.idsituacao = idsituacao;
	}

}
