package TemplateMethod;

//This exercise demonstrates the use of template method to do most of the difficult work in the abstract class, and leave
//final policy decisions which can configure the behavior to deriving classes, thus easily creating slightly different
//behavior classes without much work or duplication

//You have an abstract class Account with the following methods:
//	virtual void withdraw(): The template method. Does the hard work.
//                      asks the user how much to withdraw, and does the actual withdrawl. 
//                      In a checkingAccount lets you go into negative balance. In SavingsAccount does not let overdraft.
//virtual void print() : prints how much the account has, and how much was removed.

//You have two classes deriving from Account
//CheckingAccount - always lets you withdraw, and go into negative balance
//SavingsAccount - only lets you withdraw if your balance is greater than the withdrawl amount

//Implement the classes Account,CheckingAccount,SavingsAccount without duplicating the work of the withdraw function

/*
For example:
The following code:
			CheckingAccount checkingAccount(50);
			checkingAccount.withdraw( );
			checkingAccount.print();
Will print:
How much would you like to withdraw ?
60
Account contains -10$.  Cash removed = 60

While The following code:
			SavingsAccount savingsAccount(50);
			savingsAccount.withdraw(  );
			savingsAccount.print();
Will print:
How much would you like to withdraw ?
60
Account contains 50$.  Cash removed = 0
The End
*/

public class Example {  // client
	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount(50);
		checkingAccount.withdraw();
		checkingAccount.print();

		SavingsAccount savingsAccount = new SavingsAccount(50);
		savingsAccount.withdraw();
		savingsAccount.print();
	}
}