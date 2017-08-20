package com.build.house;

public class House {

	private String basement;
	private String floor;
	private String roof;
	private String interior;
	
	public void setBasement(String basement) {
		// TODO Auto-generated method stub
		this.basement = basement;
	}

	public void setfloor(String floor) {
		// TODO Auto-generated method stub
		this.floor = floor;
	}

	
	public void setRoof(String roof) {
		// TODO Auto-generated method stub
		this.roof = roof;
	}


	public void setInterior(String interior) {
		// TODO Auto-generated method stub
		this.interior = interior;
	}

	@Override
	public String toString() {
		return "House [basement=" + basement + ", floor=" + floor + ", roof=" + roof + ", interior=" + interior + "]";
	}	
}
