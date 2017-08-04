package com.phone;

public class PhoneBuilder {
	
	private String os;
	private String processor;
	private Double screenSize;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setScreenSize(Double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os,processor,screenSize);
	}
}
