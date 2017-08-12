package com.build.house;

public class CivilEngineer {
	
	private HouseBuilder houseBuilder;
	public CivilEngineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public House getHouse() {
		return this.houseBuilder.getHouse();
	}
	
	public void ConstructHouse() {
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildFloor();
		this.houseBuilder.buildInterior();
		this.houseBuilder.buildroof();
	}	
}
