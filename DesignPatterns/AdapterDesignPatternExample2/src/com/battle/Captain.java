package com.battle;

public class Captain implements BattleShip{

	private BattleFishingBoatAdapter adapter;
	
	public Captain() {
		adapter = new BattleFishingBoatAdapter();
	}
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		adapter.fire();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		adapter.move();
		
	}
	

}
