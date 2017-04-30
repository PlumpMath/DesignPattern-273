package Strategy;

// This demonstrates the use of strategy, where a class does most of difficult work itself, 
// and leave the final policy decisions which can configure the behavior to the strategy class, 
// thus easily creating slightly different behavior classes without much work or duplication.

// A concrete class Account with the following methods:
//	virtual void withdraw(): Does the hard work.
//                        asks the user how much to withdraw, and does the actual withdrawl. 
//                        In a checkingAccount lets you go into negative balance. 
//						  In SavingsAccount does not let overdraft.
//  virtual void print() : prints how much the account has, and how much was removed.

// Have two OverdraftStrategies modifying the behavior of Account:
// 1. CheckingAccountStrategy - always lets you withdraw, and go into negative balance
// 2. SavingsAccountStrategy - only lets you withdraw if balance is greater than withdrawl amount

// Implement classes Account,CheckingAccountStrategy,SavingsAccountStrategy without duplicating 
// the work of the withdraw function.

/*
For example:
The following code:
			Account checkingAccount(50, new CheckingAccountStrategy);
			checkingAccount.withdraw( );
			checkingAccount.print();
Will print:
How much would you like to withdraw ?
60
Account contains -10$.  Cash removed = 60

While The following code:
			Account savingsAccount(50, new SavingsAccountStrategy );
			savingsAccount.withdraw(  );
			savingsAccount.print();
Will print:
How much would you like to withdraw ?
60
Account contains 50$.  Cash removed = 0
The End
*/

public class Test { // client
	public static void main(String[] args) {
		Account checkingAccount = new Account(50, new CheckingAccountStrategy());
		checkingAccount.withdraw();
		checkingAccount.print();

		Account savingsAccount = new Account(50, new SavingsAccountStrategy() );
		savingsAccount.withdraw();
		savingsAccount.print();
	}
}
