package com.nagarro.app.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.nagarro.app.entity.EmailEntity;

public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Value("${spring.mail.username}")
	private String sender;

	// Method 1
	// To send a simple email
	public String sendSimpleMail(EmailEntity details) {

		// Try block to check for exceptions
		try {

			// Creating a simple mail message
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			String name = "\n\n\nSenderName:- "+details.getSenderName()+"\n";
			String email = "SenderEmail:- "+details.getSenderEmail()+"\n";
			
			// Setting up necessary details
			
			mailMessage.setTo(sender);
			
			mailMessage.setSubject(details.getSenderSubject());
			mailMessage.setText(details.getSenderMessage()+name+email);

			// Sending the mail
			javaMailSender.send(mailMessage);
			return "Mail Sent Successfully...";
		}

		// Catch block to handle the exceptions
		catch (Exception e) {
			return "Error while Sending Mail";
		}
	}
}
