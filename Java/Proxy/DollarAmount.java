package Proxy;

class DollarAmount implements IDollarAmount { // realSubject
	private	int dollars;
	private	int cents;
	
	public DollarAmount() {
		dollars = 0;
		cents = 0;
	}
	
	public int getDollars() {
		return dollars;
	}
	
	public int getCents() {
		return cents;
	}
	
	public void setDollars(int dollars) {
		this.dollars = dollars;
	}

	public void setCents(int cents) {
		this.cents = cents;
	}

	public void print() {
		System.out.print("Amount = " + dollars + " dollars " + cents + " cents ") ;
	}
}
