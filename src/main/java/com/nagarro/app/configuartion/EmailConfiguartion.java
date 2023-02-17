package com.nagarro.app.configuartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nagarro.app.service.EmailService;
import com.nagarro.app.service.EmailServiceImpl;

@Configuration
public class EmailConfiguartion {

	@Bean
	public EmailService emailService() {
		return new EmailServiceImpl();
	}
}
