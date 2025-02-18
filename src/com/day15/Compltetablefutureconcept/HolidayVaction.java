package com.day15.Compltetablefutureconcept;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HolidayVaction {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		
		//Fetch the flight info
		
		CompletableFuture<String> flightdetails=CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Flight Indigo booked for travelling to Leh";
			
		});
		
		//Fetch the Hotel details
		CompletableFuture<String> hoteldetails=CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Hotel booking done successfully..";
			
		});
		
		
		//fetch the car rental info
		CompletableFuture<String> cardetails=CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Car booked successfully..";
			
		});
		
		//combined all details
//		CompletableFuture<Void> alldetails=CompletableFuture.allOf(flightdetails,hoteldetails,cardetails);

		
		
		System.out.println(flightdetails.get());
     	System.out.println(cardetails.get());

		//asynchronous manner
//		alldetails.thenRun(()->{
//			
//			try {
//				System.out.println(flightdetails.get());
//				System.out.println(hoteldetails.get());
//				System.out.println(cardetails.get());
//				System.out.println("Booking completed for all..");
//
//				
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//			
//		});
//		//
//		
//		alldetails.get();
		
	}

}
