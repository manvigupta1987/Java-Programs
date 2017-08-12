package com.build.house;

public class IglooTypeHouse implements HouseBuilder {
	
	private House house;
	
	public IglooTypeHouse() {
		this.house = new House();
	}
	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("Ice Bars");
	}

	@Override
	public void buildFloor() {
		// TODO Auto-generated method stub
		house.setfloor("Ice floors");
		
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("Ice carvings");
	}

	@Override
	public void buildroof() {
		// TODO Auto-generated method stub
		house.setRoof("Ice dome");
	}
	
	public House getHouse()
	{
		return this.house;
	}
}
