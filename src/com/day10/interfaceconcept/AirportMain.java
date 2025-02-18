package com.day10.interfaceconcept;

public class AirportMain {

	public static void main(String[] args) {
		PassengerPlane pp=new PassengerPlane();
		
		Airport airport=new Airport();
		
		airport.permit(pp);
		
//		Plane p=new Plane();//Interface can't be instatiated->Obj. creation not possible.
	}

}
