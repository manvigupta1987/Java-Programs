package com.phone;

public class Phone {
	
	private String os;
	private String processor;
	private Double screenSize;
	
	public Phone(String os, String processor, Double screenSize) {
		super();
		this.os = os;
		this.processor = processor;
		this.screenSize = screenSize;
	}
	
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + "]";
	}	
}
