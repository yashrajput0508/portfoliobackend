package com.nagarro.app.service;

import org.springframework.stereotype.Service;

import com.nagarro.app.entity.EmailEntity;

@Service
public interface EmailService {
	// Method
    // To send a simple email
    String sendSimpleMail(EmailEntity details);
 
}
