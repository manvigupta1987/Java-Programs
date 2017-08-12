package com.battle;

public class BattleFishingBoatAdapter implements BattleShip{

	public FishingBoat boat;
	
	public BattleFishingBoatAdapter() {
		boat = new FishingBoat();
	}
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("this boat fires");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		boat.sail();		
	}

}
