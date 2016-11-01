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
	
	private List<PublicoAlvo> listpublicoalvo;
	private List<Cronograma> listcronogramas;
	private List<Recurso> listrecursos;
	private List<Participante> listparticipantes;
	private List<PublicoAtendido> listpublicoatendido;
	private List<ProducaoAcademica> listproducaoacademica; 
	private List<Anexo> listanexos;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public boolean isNew() {
		return null == getId();
	}
	
	

}
