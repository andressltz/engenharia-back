package br.feevale.engenharia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.springframework.data.domain.Persistable;

@Entity
public class ProducaoAcademica implements Serializable, Persistable<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idproducaoacademica;
	
	@JoinColumn
	private Projeto projeto;
	
	private String titulo;
	private Integer anopublicacao;
//	private Producao producao;
//	private AreaConhecimento areaconhecimento;
	
	
	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnopublicacao() {
		return anopublicacao;
	}

	public void setAnopublicacao(Integer anopublicacao) {
		this.anopublicacao = anopublicacao;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public Long getId() {
		return idproducaoacademica;
	}
	
	public void setIdproducaoacademica(Long idproducaoacademica) {
		this.idproducaoacademica = idproducaoacademica;
	}

	@Override
	public boolean isNew() {
		return idproducaoacademica == null;
	}

}
