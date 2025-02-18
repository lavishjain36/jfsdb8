package com.day10.abstractions;

public class AirportMain {

	public static void main(String[] args) {
		
		
		
		//create an object of passenger class.
//		PassengerPlane pp=new PassengerPlane();

		Airport airport=new Airport();
//		airport.permit(pp);//It will execute Passengerplane method
		
		//create object of cargoplane
		CargoPlane cp=new CargoPlane();
		airport.permit(cp);//it will execute CargoPlane method.
		
		
	}

}
