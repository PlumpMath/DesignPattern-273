package TemplateMethod;

import java.util.Scanner;

abstract class Account { // abstract base class
	private	double amount;
	private	double cashRemoved;
	private Scanner scanner = new Scanner( System.in );
	
	Account(double a) {
		amount = a;
		cashRemoved = 0;
	}
	
	protected double getAmount() { 
		return amount; 
	}
	
	public void withdraw() {
		System.out.println("How much would you like to withdraw ?");
		int withdrawlAmount;
		withdrawlAmount = scanner.nextInt();
		if (canWithdraw(withdrawlAmount)) {
			amount = amount - withdrawlAmount;
			cashRemoved = cashRemoved + withdrawlAmount;
		}
	}
	
	public abstract boolean canWithdraw(double withdrawlAmount); // key
	
	public void print() {
		System.out.println("Account contains " + amount + "$.  Cash removed = " + cashRemoved);
	}
	
	@Override 
	protected void finalize() throws Throwable {
		scanner.close();
	}
}