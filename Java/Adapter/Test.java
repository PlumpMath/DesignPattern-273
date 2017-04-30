// Have an interface called IDollarAmount. It has the following methods
// a function int getDollars()
// a function int getCents()

// Have a new class DollarAmount which implements the IDollarAmount interface.
// Have a class AmountPrinter with a function printAmounts which can print a 
// vector of this IDollarAmount interface.

// Have a legacy class called FractionalDollarAmount which does not implement 
// IDollarAmount. It just has a double member to represent dollars It only has 
// method: double getDollars() 

// Create a class which will use AmountPrinter to print FractionalDollarAmount.

package Adapter;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		demoUseOfAdapter();
	}
	
	public static void demoUseOfAdapter(){
		ArrayList<IDollarAmount> amounts = new ArrayList<>();
		DollarAmount dollarAmount = new DollarAmount(19, 95);
		FractionalDollarAmount fractionalDollarAmount = new FractionalDollarAmount(17.89);
		amounts.add(dollarAmount);
		DollarAdapter da = new DollarAdapter(fractionalDollarAmount);
		amounts.add(da);
		
		// Should print 19.95 and 17.89
		AmountPrinter.printAmounts( amounts );
	}
}






