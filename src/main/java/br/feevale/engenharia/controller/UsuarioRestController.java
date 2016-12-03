package br.feevale.engenharia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.NestedServletException;

import br.feevale.engenharia.model.Usuario;
import br.feevale.engenharia.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioRestController {

    @Autowired
    private UsuarioService service;

    @ResponseBody
    @RequestMapping(value = "/{idModel}", method = RequestMethod.GET)
    public Usuario findById(@PathVariable("idModel") Long idModel) {
        return service.findById(idModel);
    }

    @ResponseBody
    @RequestMapping
    public List<Usuario> listAll() {
        return service.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public Usuario novo(@RequestBody Usuario usuario) throws Exception {
    	if (usuario.getSenha().equals(usuario.getValidacaosenha())) {
    		return service.save(usuario);
    	}
    	throw new NestedServletException("As senhas são diferentes");
    }

    @ResponseBody
    @RequestMapping(value = "/atualiza", method = RequestMethod.POST)
    public Usuario atualiza(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }

    @ResponseBody
    @RequestMapping(value = "/exclui/{id}", method = RequestMethod.GET)
    public void exclui(@PathVariable("id") Long idModel) {
        service.delete(idModel);
    }
    
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Usuario logar(@RequestBody Usuario usuario) throws Exception {
    	Usuario usuarioLogado = service.findByUsuarioOrEmailAndSenha(usuario);
    	if (usuarioLogado != null){
    		return usuarioLogado;
    	}
    	throw new NestedServletException("Usuário ou senha errado."); 
    }
    
    @ResponseBody
    @RequestMapping(value = "/recuperar", method = RequestMethod.POST)
	public Usuario recuperar(@RequestBody Usuario usuario) throws Exception {
    	Usuario usuarioLocalizado = service.findByUsuarioOrEmail(usuario);
    	if (usuarioLocalizado == null){
    		throw new NestedServletException("Usuário não localizado."); 
    	}
    	service.sendEmailRecuperacaoSenha(usuarioLocalizado);
		return usuarioLocalizado;
    }

}
