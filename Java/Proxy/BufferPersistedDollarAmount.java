package Proxy;

class BufferPersistedDollarAmount  implements  IDollarAmount { // proxy 
	private DollarAmount realDollarAmount;	
	private int[] buffer;
	 
	private boolean isInit() {
		// do something to check whether proxy has already been inited.
		return true;
	}
	
	private void init() {
		// do something to init proxy
	}
	
	public int getDollars() {
		if (!isInit())
			init();
		
		return realDollarAmount.getDollars();
	}
	
	public int getCents() {
		if (!isInit())
			init();
		
		return realDollarAmount.getCents();
	}
	
	public void setDollars(int dollars) {
		if (!isInit())
			init();
		buffer[0] = dollars; // persist
		realDollarAmount.setDollars(dollars);
	}
	
	public void setCents(int cents) {
		if (!isInit())
			init();
		buffer[1] = cents; // persist
		realDollarAmount.setCents(cents);
	}
	
	public void print() {
		if (!isInit())
			init();
		realDollarAmount.print();
	}
	
	BufferPersistedDollarAmount(int[] buffer, DollarAmount realDollarAmount) {
		this.buffer = buffer;
		this.realDollarAmount = realDollarAmount;
		setCents( realDollarAmount.getCents() );
		setDollars( realDollarAmount.getDollars() );

	}
}
