package br.feevale.engenharia.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.domain.Persistable;

@Entity
public class Projeto implements Serializable, Persistable<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idprojeto;
	
	private String nome;
	
	private String titulo;

	private String proponente;
	
	private String justificativa;
	
	private String objetivosgerais;
	
	private String objetivosespecificos;
	
	private String inicio;
	
	private String termino;
	
	private String identificador;
	
	private String situacao;
	
	private String classificacao;
	
	private String dimensaoinstitucional;
	
	private String proposta;
	
	private String resultados;
	
	private String cronograma;
	
	private String publicalvo;
	
	private String avaliacao;
	
	private String justificativacontinuacao;
	
	private List<Cronograma> cronogramas;
	
//	private Situacao situacao;
//	pprivate Classificacao classificacao;
//	private DimensaoInstitucional dimensaoInstitucional;
	
	
	public Long getIdprojeto() {
		return idprojeto;
	}

	public void setIdprojeto(Long idprojeto) {
		this.idprojeto = idprojeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProponente() {
		return proponente;
	}

	public void setProponente(String proponente) {
		this.proponente = proponente;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public String getObjetivosgerais() {
		return objetivosgerais;
	}

	public void setObjetivosgerais(String objetivosgerais) {
		this.objetivosgerais = objetivosgerais;
	}

	public String getObjetivosespecificos() {
		return objetivosespecificos;
	}

	public void setObjetivosespecificos(String objetivosespecificos) {
		this.objetivosespecificos = objetivosespecificos;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getTermino() {
		return termino;
	}

	public void setTermino(String termino) {
		this.termino = termino;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getDimensaoinstitucional() {
		return dimensaoinstitucional;
	}

	public void setDimensaoinstitucional(String dimensaoinstitucional) {
		this.dimensaoinstitucional = dimensaoinstitucional;
	}

	public String getProposta() {
		return proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	public String getResultados() {
		return resultados;
	}

	public void setResultados(String resultados) {
		this.resultados = resultados;
	}

	public String getCronograma() {
		return cronograma;
	}

	public void setCronograma(String cronograma) {
		this.cronograma = cronograma;
	}

	public String getPublicalvo() {
		return publicalvo;
	}

	public void setPublicalvo(String publicalvo) {
		this.publicalvo = publicalvo;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getJustificativacontinuacao() {
		return justificativacontinuacao;
	}

	public void setJustificativacontinuacao(String justificativacontinuacao) {
		this.justificativacontinuacao = justificativacontinuacao;
	}
	

	public List<Cronograma> getCronogramas() {
		return cronogramas;
	}

	public void setCronogramas(List<Cronograma> cronogramas) {
		this.cronogramas = cronogramas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public Long getId() {
		return idprojeto;
	}

	@Override
	public boolean isNew() {
		return null == getId();
	}
	
	

}
