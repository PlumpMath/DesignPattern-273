package TemplateMethod;

class SavingsAccount extends Account {
	public SavingsAccount(double amount)  {
		super( amount );
	}
	
	public boolean canWithdraw(double withdrawlAmount) {
		if ( withdrawlAmount <= getAmount() )
			return true;
		else
			return false;
	}
}