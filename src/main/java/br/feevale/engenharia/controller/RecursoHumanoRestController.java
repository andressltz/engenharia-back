package br.feevale.engenharia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.feevale.engenharia.model.RecursoHumano;
import br.feevale.engenharia.service.RecursoHumanoService;

@RestController
@RequestMapping("recurso-humano")
public class RecursoHumanoRestController {

    @Autowired
    private RecursoHumanoService service;

    @ResponseBody
    @RequestMapping(value = "/{idModel}", method = RequestMethod.GET)
    public RecursoHumano findById(@PathVariable("idModel") Long idModel) {
        return service.findById(idModel);
    }

    @ResponseBody
    @RequestMapping
    public List<RecursoHumano> listAll() {
        return service.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public RecursoHumano novo(@RequestBody RecursoHumano aluno) {
        return service.save(aluno);
    }

    @ResponseBody
    @RequestMapping(value = "/atualiza", method = RequestMethod.POST)
    public RecursoHumano atualiza(@RequestBody RecursoHumano aluno) {
        return service.save(aluno);
    }

    @ResponseBody
    @RequestMapping(value = "/exclui/{idModel}", method = RequestMethod.GET)
    public void exclui(@PathVariable("idModel") Long idModel) {
        service.delete(idModel);
    }

}
