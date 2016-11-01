package br.feevale.engenharia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.feevale.engenharia.model.ClassificacaoProjeto;
import br.feevale.engenharia.service.ClassificacaoProjetoService;

@RestController
@RequestMapping("classificacao-projeto")
public class ClassificacaoProjetoRestController {
	
	@Autowired
	private ClassificacaoProjetoService service;

	@ResponseBody
	@RequestMapping
	public List<ClassificacaoProjeto> listAll() {
		return service.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public ClassificacaoProjeto novo(@RequestBody ClassificacaoProjeto aluno){
		return service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/atualiza", method = RequestMethod.POST)
	public ClassificacaoProjeto atualiza(@RequestBody ClassificacaoProjeto aluno){
		return service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/exclui/{idModel}", method = RequestMethod.GET)
	public void exclui(@PathVariable("idModel")Long idModel) {
		service.delete(idModel);
	}
	
}
