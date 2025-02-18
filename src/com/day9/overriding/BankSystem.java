package com.day9.overriding;

public class BankSystem {

	public static void main(String[] args) {
		Bank bank=new Bank();
		System.out.println("General bank interest rate :"+bank.getinterestrate());
		
		//method available->overriden method in saving account
		Bank saving=new SavingAccount();
		
		System.out.println("Saving bank interest rate :"+saving.getinterestrate());
		
		//method available->overriden method in current account
		Bank current=new CurrentAccount();
		System.out.println("Current bank interest rate :"+current.getinterestrate());

	}

}
