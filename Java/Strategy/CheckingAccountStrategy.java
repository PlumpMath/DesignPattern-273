package Strategy;

class CheckingAccountStrategy implements OverdraftStrategy
{
	public boolean canWithdraw(double amount, double money) {
		return true;
	}
}