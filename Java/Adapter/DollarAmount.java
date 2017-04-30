package Adapter;

class DollarAmount implements IDollarAmount {
	private	int dollars;
	private	int cents;
	
	public DollarAmount(int dollars, int cents) {
		this.dollars = dollars;
		this.cents = cents;
	}
	
	public int getDollars() {
		return dollars;
	}
	
	public int getCents(){
		return cents;
	}
}