package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class Recurso extends BaseModel {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idrecurso;
	
	@JoinColumn
	private Projeto projeto;
	private String txdescricao;
	private Integer quantidade;
	private Double valor;

	public Long getIdrecurso() {
		return idrecurso;
	}

	public void setIdrecurso(Long idrecurso) {
		this.idrecurso = idrecurso;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public String getTxdescricao() {
		return txdescricao;
	}

	public void setTxdescricao(String txdescricao) {
		this.txdescricao = txdescricao;
	}

	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public Long getId() {
		return idrecurso;
	}


}
