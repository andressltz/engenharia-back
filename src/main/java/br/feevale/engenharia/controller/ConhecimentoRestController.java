package br.feevale.engenharia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.feevale.engenharia.model.Conhecimento;
import br.feevale.engenharia.service.ConhecimentoService;

@RestController
@RequestMapping("conhecimento")
public class ConhecimentoRestController {
	
	@Autowired
	private ConhecimentoService service;

	@ResponseBody
	@RequestMapping
	public List<Conhecimento> listAll() {
		return service.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public Conhecimento novo(@RequestBody Conhecimento aluno){
		return service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/atualiza", method = RequestMethod.POST)
	public Conhecimento atualiza(@RequestBody Conhecimento aluno){
		return service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/exclui/{idModel}", method = RequestMethod.GET)
	public void exclui(@PathVariable("idModel")Long idModel) {
		service.delete(idModel);
	}
	
}
