package com.userdefinedexception;

public class Trainreservation {
	
	private int availableseats=10;
	
	//method to book a ticket
	//delegating responsibility to TrainBookingException
	public void bookticket(int requestedseats) throws TrainBookingException {
		if(requestedseats>availableseats) {
			throw new TrainBookingException("Booking failed due to unavailability of seats.");
		}else {
			availableseats=availableseats-requestedseats;
			System.out.println("Bookimg successfull :"+requestedseats);
		}
	}
	public static void main(String[] args) {
		Trainreservation ts=new Trainreservation();
		
		try {
			ts.bookticket(3);
			ts.bookticket(7);
			ts.bookticket(1);

		} catch (TrainBookingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
