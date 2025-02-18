package com.day10.abstractions;

public class PassengerPlane extends Plane {

	@Override
	public void takeoff() {
		System.out.println("Passenger need medium runway to take off.");	
	}

	@Override
	public void fly() {
		System.out.println("Passenger Plane flies at medium height.");
		
	}

	@Override
	public void landing() {
		System.out.println("Passenger Planed need medium runway to land.");
		
	}

}
