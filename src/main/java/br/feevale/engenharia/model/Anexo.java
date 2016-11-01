package br.feevale.engenharia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.springframework.data.domain.Persistable;

@Entity
public class Anexo implements Serializable, Persistable<Long> {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idanexo;
	
	@JoinColumn
	private Projeto projeto;
	
	private String nome;
	private byte[] file;
	
	
	
	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public Long getId() {
		return idanexo;
	}

	public void setIdanexo(Long idanexo) {
		this.idanexo = idanexo;
	}
	
	@Override
	public boolean isNew() {
		return idanexo == null;
	}

}
