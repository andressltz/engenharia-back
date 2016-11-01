package br.feevale.engenharia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.feevale.engenharia.model.Aluno;
import br.feevale.engenharia.service.AlunoService;

@RestController
@RequestMapping("aluno")
public class AlunoRestController {
	
	@Autowired
	private AlunoService service;

	@ResponseBody
	@RequestMapping
	public List<Aluno> listAll() {
		return service.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public Aluno novo(@RequestBody Aluno aluno){
		return service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/atualiza", method = RequestMethod.POST)
	public Aluno atualiza(@RequestBody Aluno aluno){
		return service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/exclui/{idModel}", method = RequestMethod.GET)
	public void exclui(@PathVariable("idModel")Long idModel) {
		service.delete(idModel);
	}
	
}
