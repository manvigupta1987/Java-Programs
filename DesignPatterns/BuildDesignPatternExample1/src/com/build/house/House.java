package com.build.house;

public class House implements HousePlan{

	private String basement;
	private String floor;
	private String roof;
	private String interior;
	
	@Override
	public void setBasement(String basement) {
		// TODO Auto-generated method stub
		this.basement = basement;
	}

	@Override
	public void setfloor(String floor) {
		// TODO Auto-generated method stub
		this.floor = floor;
	}

	@Override
	public void setRoof(String roof) {
		// TODO Auto-generated method stub
		this.roof = roof;
	}

	@Override
	public void setInterior(String interior) {
		// TODO Auto-generated method stub
		this.interior = interior;
	}

	@Override
	public String toString() {
		return "House [basement=" + basement + ", floor=" + floor + ", roof=" + roof + ", interior=" + interior + "]";
	}	
}
