package com.build.house;

public class WoodenHouseType implements HouseBuilder {
	private House house;
	
	public WoodenHouseType() {
		this.house = new House();
	}
	
	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("Wooden basement");
	}

	@Override
	public void buildFloor() {
		// TODO Auto-generated method stub
		house.setfloor("Wooden floors");
		
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("wooden carvings");
	}

	@Override
	public void buildroof() {
		// TODO Auto-generated method stub
		house.setRoof("Wooden dome");
	}
	
	public House getHouse()
	{
		return this.house;
	}
}
