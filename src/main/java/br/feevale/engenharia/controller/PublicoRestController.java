package br.feevale.engenharia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.feevale.engenharia.model.Publico;
import br.feevale.engenharia.service.PublicoService;

@RestController
@RequestMapping("publico")
public class PublicoRestController {
	
	@Autowired
	private PublicoService service;

       	@ResponseBody
	@RequestMapping(value = "/{idModel}", method = RequestMethod.GET)
	public Publico findById(@PathVariable("idModel")Long idModel) {
		return service.findById(idModel);
	} 
        
	@ResponseBody
	@RequestMapping
	public List<Publico> listAll() {
		return service.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public Publico novo(@RequestBody Publico aluno){
		return service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/atualiza", method = RequestMethod.POST)
	public Publico atualiza(@RequestBody Publico aluno){
		return service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/exclui/{idModel}", method = RequestMethod.GET)
	public void exclui(@PathVariable("idModel")Long idModel) {
		service.delete(idModel);
	}
	
}
