package com.nagarro.app.entity;

public class Response {
	String Message;

	public Response(String message) {
		Message = message;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "ResponseEntity [Message=" + Message + "]";
	}
}
