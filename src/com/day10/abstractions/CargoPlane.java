package com.day10.abstractions;

public  class CargoPlane extends Plane {

	public CargoPlane() {
		super();
	}
	@Override
	public void takeoff() {
		System.out.println("CargoPlane needs longer runway to take off");
	}

	@Override
	public void fly() {
		System.out.println("CargoPlane flies at low height.");

	}

	@Override
	public void landing() {
		System.out.println("CargoPlane needs longer runway to landing.");

	}

	

}
