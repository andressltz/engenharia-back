package br.feevale.engenharia.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import br.feevale.engenharia.AppConfiguration;

@Component
public class EmailService {

	@Autowired
	private MailConfiguration mailConfiguration;

	@Autowired
	private AppConfiguration appConfiguration;

	public void enviaEmail(String to, String subject, String body) {
		SimpleMailMessage message = new SimpleMailMessage();

		String from = appConfiguration.getAppName().concat("<").concat(mailConfiguration.getFrom()).concat(">");
		message.setFrom(mailConfiguration.getFrom());
		message.setReplyTo("noreply@feevale.eng.br");
		message.setSubject(subject);
		message.setTo(to);
		message.setText(body);

		mailConfiguration.getJavaMailSender().send(message);
	}

}
