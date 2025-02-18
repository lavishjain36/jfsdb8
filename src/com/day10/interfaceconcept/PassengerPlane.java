package com.day10.interfaceconcept;

public class PassengerPlane implements Plane {

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
