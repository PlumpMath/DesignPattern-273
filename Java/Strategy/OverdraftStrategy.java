package Strategy;

interface OverdraftStrategy { // strategy
	public boolean canWithdraw(double amount, double money);
}