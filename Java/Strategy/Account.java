package Strategy;

import java.util.Scanner;


class Account { // context
	private double amount;
	private double cashRemoved;
	private OverdraftStrategy overdraftStrategy;
	private Scanner scanner = new Scanner( System.in );
	
	Account( double amount, OverdraftStrategy  strategy ) {
		this.amount = amount;
		this.overdraftStrategy = strategy;
		cashRemoved = 0;
	}
	
	public void withdraw() {
		System.out.println("How much would you like to withdraw ?");
		int withdrawlAmount;
		withdrawlAmount = scanner.nextInt();
		if (overdraftStrategy.canWithdraw(amount, withdrawlAmount)) {
			amount = amount - withdrawlAmount;
			cashRemoved = cashRemoved + withdrawlAmount;
		}
	}
	
	public void print() {
		System.out.println( "Account contains " + amount + "$.  Cash removed = " + cashRemoved);
	}
	
	@Override protected void finalize() throws Throwable {
		scanner.close();
	}
}