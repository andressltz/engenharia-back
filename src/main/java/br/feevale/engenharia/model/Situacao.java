package br.feevale.engenharia.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.domain.Persistable;

public class Situacao implements Serializable, Persistable<Long> {

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

	@Override
	public boolean isNew() {
		return idsituacao == null;
	}

}
