package com.nagarro.app.entity;

public class EmailEntity {
	private String senderName;
	private String senderEmail;
	private String senderSubject;
	private String senderMessage;

	public EmailEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public EmailEntity(String senderName, String senderEmail, String senderSubject, String senderMessage) {
		this.senderName = senderName;
		this.senderEmail = senderEmail;
		this.senderSubject = senderSubject;
		this.senderMessage = senderMessage;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderEmail() {
		return senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	public String getSenderSubject() {
		return senderSubject;
	}
	public void setSenderSubject(String senderSubject) {
		this.senderSubject = senderSubject;
	}
	public String getSenderMessage() {
		return senderMessage;
	}
	public void setSenderMessage(String senderMessage) {
		this.senderMessage = senderMessage;
	}
	@Override
	public String toString() {
		return "EmailEntity [senderName=" + senderName + ", senderEmail=" + senderEmail + ", senderSubject="
				+ senderSubject + ", senderMessage=" + senderMessage + "]";
	}

}
