package Strategy;

class SavingsAccountStrategy implements OverdraftStrategy {
	@Override
	public boolean canWithdraw(double amount, double withdrawlAmount) {
		if ( withdrawlAmount <= amount )
			return true;
		else
			return false;
	}
}