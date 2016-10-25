package br.feevale.engenharia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.springframework.data.domain.Persistable;


@Entity
public class PublicoAlvo implements Serializable, Persistable<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idpublicoalvo;
	
	@JoinColumn
	private Projeto projeto;
//	private List<Descricao> descricoes;
	
	
	@Override
	public Long getId() {
		return idpublicoalvo;
	}
	
	public void setIdpublicoalvo(Long idpublicoalvo) {
		this.idpublicoalvo = idpublicoalvo;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	@Override
	public boolean isNew() {
		return idpublicoalvo == null;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}