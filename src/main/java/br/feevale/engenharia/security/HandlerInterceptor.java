package br.feevale.engenharia.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class HandlerInterceptor extends WebMvcConfigurerAdapter {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	}    

}
