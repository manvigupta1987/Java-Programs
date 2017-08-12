package com.factory;

public class ColorFactory implements AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if(color == null) {
			return null;
		}
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}else if(color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		else {
			return null;
		}
	}
}
