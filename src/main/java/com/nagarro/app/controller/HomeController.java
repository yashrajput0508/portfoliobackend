package com.nagarro.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.app.entity.EmailEntity;
import com.nagarro.app.entity.Response;
import com.nagarro.app.service.EmailService;

@RestController
@CrossOrigin()
public class HomeController {
	
	private EmailService emailService;
	
	@Autowired
	public HomeController(EmailService emailService) {
		this.emailService = emailService;
	}
	
    // Sending a simple Email
    @PostMapping("/sendMail")
    public Response sendMail(@RequestBody EmailEntity details)
    {
        String status
            = emailService.sendSimpleMail(details);
 
        return new Response(status);
    }
    
    @GetMapping("/testing")
    public boolean testing() {
    	return true;
    }
}
