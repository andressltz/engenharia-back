package br.feevale.engenharia.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HomeRestController {

	@ResponseBody
	@RequestMapping
	public String home() {
		return "engenharia-back";
	}
	
}
