package br.feevale.engenharia.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	@RequestMapping(value = "/word", method = RequestMethod.GET)
	public String helloWord(){
		Aluno aluno = new Aluno();
		aluno.setIdAluno(2L);
		aluno.setNome("teste");
		service.save(aluno);
		return config.teste();
	}
	
}
