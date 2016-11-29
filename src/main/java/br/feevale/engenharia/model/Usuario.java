package br.feevale.engenharia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

import br.feevale.engenharia.base.BaseModel;

@Entity
public class Usuario extends BaseModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idusuario;

	private String senha;

	private String email;

	private Integer matricula;

	private String bairro;

	private String celular;

	private String cep;

	private String cidade;

	private String cpfrne;

	private String estado;

	private String estadocivil;
	
	@JoinColumn
	private InstitutoAcademico institutoAcademico;

	private String logradouro;

	private String nome;

	private String pais;

	private String rg;

	private String sexo;

	private String sobrenome;

	private String telefone;
	
	@Transient
	private String validacaosenha; 
	
	@JoinColumn
	private Colaborador tipoVinculo;

	private String usuario;

	@Override
	public Long getId() {
		return idusuario;
	}

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCpfrne() {
		return cpfrne;
	}

	public void setCpfrne(String cpfrne) {
		this.cpfrne = cpfrne;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Colaborador getTipoVinculo() {
		return tipoVinculo;
	}

	public void setTipoVinculo(Colaborador tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public InstitutoAcademico getInstitutoAcademico() {
		return institutoAcademico;
	}

	public void setInstitutoAcademico(InstitutoAcademico institutoAcademico) {
		this.institutoAcademico = institutoAcademico;
	}

	public String getValidacaosenha() {
		return validacaosenha;
	}

	public void setValidacaosenha(String validacaosenha) {
		this.validacaosenha = validacaosenha;
	}
	

}
