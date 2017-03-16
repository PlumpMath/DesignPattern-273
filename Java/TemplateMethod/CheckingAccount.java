package TemplateMethod;

class CheckingAccount extends Account {
	CheckingAccount(double amount) {
		super (amount);
	}
	
	public boolean canWithdraw(double withdrawlAmount) {
			return true;
	}
}