package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class Projeto extends BaseModel {
	
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
	private String proposta;
	private String resultados;
	private String avaliacao;
	
//	private List<PublicoAlvo> publicoalvo;
	private String justificativacontinuacao;
//	private List<Cronograma> cronogramas;
//	private List<Recurso> recursos;
//	private List<Participante> participantes;
//	private List<PublicoAtendido> publicoatendido;
	
//	private Situacao situacao;
//	pprivate Classificacao classificacao;
//	private DimensaoInstitucional dimensaoInstitucional;
	
	@Override
	public Long getId() {
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


//	public List<PublicoAlvo> getPublicoalvo() {
//		return publicoalvo;
//	}
//
//	public void setPublicoalvo(List<PublicoAlvo> publicoalvo) {
//		this.publicoalvo = publicoalvo;
//	}

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
	

//	public List<Cronograma> getCronogramas() {
//		return cronogramas;
//	}
//
//	public void setCronogramas(List<Cronograma> cronogramas) {
//		this.cronogramas = cronogramas;
//	}
	

//	public List<Recurso> getRecursos() {
//		return recursos;
//	}
//
//	public void setRecursos(List<Recurso> recursos) {
//		this.recursos = recursos;
//	}
//
//	public List<Participante> getParticipantes() {
//		return participantes;
//	}
//
//	public void setParticipantes(List<Participante> participantes) {
//		this.participantes = participantes;
//	}
//	
//
//	public List<PublicoAtendido> getPublicoatendido() {
//		return publicoatendido;
//	}
//
//	public void setPublicoatendido(List<PublicoAtendido> publicoatendido) {
//		this.publicoatendido = publicoatendido;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}