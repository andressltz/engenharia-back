package br.feevale.engenharia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.feevale.engenharia.Configuration;
import br.feevale.engenharia.model.Aluno;
import br.feevale.engenharia.service.AlunoService;

@RestController
@RequestMapping(value = "hello")
public class HelloWordRestController {
	
	@Autowired
	private Configuration config;
	
	@Autowired
	private AlunoService service;

	@ResponseBody
	@RequestMapping
	public List<Aluno> hello() {
		return service.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	public String novo(){
		Aluno aluno = new Aluno();
		aluno.setNome("teste2");
		service.save(aluno);
		return config.teste();
	}
	
	@ResponseBody
	@RequestMapping(value = "/atualiza/{nome}", method = RequestMethod.GET)
	public void atualiza(@PathVariable("nome") String nome){
		Aluno aluno = new Aluno();
		aluno = service.findById(7L);
		aluno.setNome(nome);
		service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/exclui/{idAluno}", method = RequestMethod.GET)
	public void exclui(@PathVariable("idAluno")Long idAluno) {
		service.delete(idAluno);
	}
	
}
