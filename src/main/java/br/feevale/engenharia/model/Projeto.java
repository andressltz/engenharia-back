package br.feevale.engenharia.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class Projeto extends BaseModel {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idprojeto;
	private String nome;
	private String titulo;
	private Status status;
	private String justificativa;
	private String objetivosgerais;
	private String objetivosespecificos;
	private String propostaarticulacao;
	private String resultadoesperado;
	private String listjustificativacontinuacao;
	private String inicio;
	private String termino;
	private String identificador;
	private Classificacao classificacao; 
	private String proposta;
	private String resultados;
	private String avaliacao;
	private Funcionario proponente;
	
	@OneToMany
	private List<PublicoAlvo> listpublicoalvo;
	
	@OneToMany
	private List<Cronograma> listcronogramas;
	
	@OneToMany
	private List<Recurso> listrecursos;

	@OneToMany
	private List<Participante> listparticipantes;

	@OneToMany
	private List<PublicoAtendido> listpublicoatendido;

	@OneToMany
	private List<ProducaoAcademica> listproducaoacademica; 

	@OneToMany
	private List<Anexo> listanexos;
	
	private Situacao situacao;
	
	private DimensaoInstitucional dimensaoInstitucional;
	
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

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

}