package br.feevale.engenharia;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Value("${app.name}")
	private String appName;
	
	@Value("${app.front.url}")
	private String appFrontUrl;

	public String getAppName() {
		return appName;
	}

	public String getAppFrontUrl() {
		return appFrontUrl;
	}

}
