package br.feevale.engenharia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.feevale.engenharia.model.Cronograma;
import br.feevale.engenharia.service.CronogramaService;

@RestController
@RequestMapping("cronograma")
public class CronogramaRestController {

    @Autowired
    private CronogramaService service;

    @ResponseBody
    @RequestMapping(value = "/{idModel}", method = RequestMethod.GET)
    public Cronograma findById(@PathVariable("idModel") Long idModel) {
        return service.findById(idModel);
    }

    @ResponseBody
    @RequestMapping
    public List<Cronograma> listAll() {
        return service.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public Cronograma novo(@RequestBody Cronograma aluno) {
        return service.save(aluno);
    }

    @ResponseBody
    @RequestMapping(value = "/atualiza", method = RequestMethod.POST)
    public Cronograma atualiza(@RequestBody Cronograma aluno) {
        return service.save(aluno);
    }

    @ResponseBody
    @RequestMapping(value = "/exclui/{idModel}", method = RequestMethod.GET)
    public void exclui(@PathVariable("idModel") Long idModel) {
        service.delete(idModel);
    }

}
