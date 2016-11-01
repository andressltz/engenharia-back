package br.feevale.engenharia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.feevale.engenharia.model.Colaborador;
import br.feevale.engenharia.service.ColaboradorService;

@RestController
@RequestMapping("colaborador")
public class ColaboradorRestController {
	
	@Autowired
	private ColaboradorService service;

	@ResponseBody
	@RequestMapping
	public List<Colaborador> listAll() {
		return service.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public Colaborador novo(@RequestBody Colaborador aluno){
		return service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/atualiza", method = RequestMethod.POST)
	public Colaborador atualiza(@RequestBody Colaborador aluno){
		return service.save(aluno);
	}
	
	@ResponseBody
	@RequestMapping(value = "/exclui/{id}", method = RequestMethod.GET)
	public void exclui(@PathVariable("id")Long idModel) {
		service.delete(idModel);
	}
	
}
