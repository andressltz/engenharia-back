package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import br.feevale.engenharia.base.BaseModel;


@Entity
public class Descricao extends BaseModel{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long iddescricao;
	
	@JoinColumn
	private PublicoAlvo publicoalvo;
	
	private String texto;
	
	
	@Override
	public Long getId() {
		return iddescricao;
	}
	
	public void setIddescricao(Long iddescricao) {
		this.iddescricao = iddescricao;
	}
	
	
	public PublicoAlvo getPublicoalvo() {
		return publicoalvo;
	}

	public void setPublicoalvo(PublicoAlvo publicoalvo) {
		this.publicoalvo = publicoalvo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
