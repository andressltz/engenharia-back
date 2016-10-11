package br.feevale.engenharia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.domain.Persistable;

@SuppressWarnings("serial")
@Entity
public class Recurso implements Serializable, Persistable<Long> {
	
	@Id
	@GeneratedValue
	private Long idrecurso;
	private String txdescricao;

	
	public Long getIdrecurso() {
		return idrecurso;
	}

	public void setIdrecurso(Long idrecurso) {
		this.idrecurso = idrecurso;
	}

	public String getTxdescricao() {
		return txdescricao;
	}

	public void setTxdescricao(String txdescricao) {
		this.txdescricao = txdescricao;
	}

	@Override
	public Long getId() {
		return idrecurso;
	}

	@Override
	public boolean isNew() {
		return null == getId();
	}
	
	

}
