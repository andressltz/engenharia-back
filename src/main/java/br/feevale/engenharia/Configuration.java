package br.feevale.engenharia;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Configuration {
	
	@Value("${prop.valor}")
	private String valor;
	
	public String teste(){
		return valor;
	}

}
