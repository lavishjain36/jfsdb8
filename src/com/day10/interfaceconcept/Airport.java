package com.day10.interfaceconcept;

public class Airport   {
	
	public void permit(Plane plane) {
		plane.takeoff();
		plane.fly();
		plane.landing();
	}

}
