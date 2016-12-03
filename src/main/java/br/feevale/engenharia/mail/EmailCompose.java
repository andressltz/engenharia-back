package br.feevale.engenharia.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.AppConfiguration;

@Component
public class EmailCompose {

	@Autowired
	private AppConfiguration appConfig;

	private final String BR = "\n";

	public String getRecoverPasswordBody(String nome, String senha) {
		StringBuilder body = new StringBuilder();
		body.append("Olá ").append(nome).append(BR).append(BR);
		body.append("Sua senha é ").append(senha).append(BR).append(BR);
		body.append("Use-a para se logar em ").append(appConfig.getAppFrontUrl()).append(BR).append(BR).append(BR);
		body.append("Mensagem automática enviada pelo sistema ").append(appConfig.getAppName()).append(", não responda este email.");
		body.append(BR);
		return body.toString();
	}

}
