package com.venture.some.design.pattern;

public class User {

	private String name;
	private String message;
	
	public User(String name) {
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sendMessage(String message) {
		
		this.setMessage(message);
		ChatRoom.sendMessage(this);
	}	
}
