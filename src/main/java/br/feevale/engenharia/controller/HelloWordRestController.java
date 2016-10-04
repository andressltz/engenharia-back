package br.feevale.engenharia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordRestController {

	@RequestMapping(value = "/word", method = RequestMethod.GET)
	public String helloWord(){
		return "helloWord";
	}
	
}
