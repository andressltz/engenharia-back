package br.feevale.engenharia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.feevale.engenharia.model.InstitutoAcademico;
import br.feevale.engenharia.service.InstitutoAcademicoService;

@RestController
@RequestMapping("instituto-academico")
public class InstitutoAcademicoRestController {

    @Autowired
    private InstitutoAcademicoService service;

    @ResponseBody
    @RequestMapping(value = "/{idModel}", method = RequestMethod.GET)
    public InstitutoAcademico findById(@PathVariable("idModel") Long idModel) {
        return service.findById(idModel);
    }

    @ResponseBody
    @RequestMapping
    public List<InstitutoAcademico> listAll() {
        return service.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public InstitutoAcademico novo(@RequestBody InstitutoAcademico aluno) {
        return service.save(aluno);
    }

    @ResponseBody
    @RequestMapping(value = "/atualiza", method = RequestMethod.POST)
    public InstitutoAcademico atualiza(@RequestBody InstitutoAcademico aluno) {
        return service.save(aluno);
    }

    @ResponseBody
    @RequestMapping(value = "/exclui/{id}", method = RequestMethod.GET)
    public void exclui(@PathVariable("id") Long idModel) {
        service.delete(idModel);
    }

}
