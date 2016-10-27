package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import br.feevale.engenharia.base.BaseModel;


@Entity
public class PublicoAlvo extends BaseModel {

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

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}