package Adapter;

public class DollarAdapter implements IDollarAmount {
	private	FractionalDollarAmount data;
	
	public DollarAdapter(FractionalDollarAmount fda) {
		data = fda;
	}

	@Override
	public int getDollars() {
		return (int)data.getAmount();
	}

	@Override
	public int getCents() {
		return (int)(100 * (data.getAmount() - getDollars()));
	}
}
