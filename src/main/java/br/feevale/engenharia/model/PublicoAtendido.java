package br.feevale.engenharia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.springframework.data.domain.Persistable;


@Entity
public class PublicoAtendido implements Serializable, Persistable<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idpublicoatendido;
	
	@JoinColumn
	private Projeto projeto;
	private Integer quantidade;
//	private Descricao descricao;
	
	
	@Override
	public Long getId() {
		return idpublicoatendido;
	}
	
	public void setIdpublicoatendido(Long idpublicoatendido) {
		this.idpublicoatendido = idpublicoatendido;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public boolean isNew() {
		return idpublicoatendido == null;
	}

}
