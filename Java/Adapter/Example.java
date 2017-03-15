// You have an interface called IDollarAmount. It has the following methods
// a function int getDollars()
// a function int getCents()

// You have a new class DollarAmount which implements the IDollarAmount interface.

// You have a class AmountPrinter with a function printAmounts which can print a vector of this IDollarAmount interface

// You have a legacy class called FractionalDollarAmount which does not implement IDollarAmount
// It just has a double member to represent dollars
// It only has the following method: double getDollars() 

// Create a class which will let you use AmountPrinter to print FractionalDollarAmount objects

package Adapter;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		demoUseOfAdapter();
	}
	
	public static void demoUseOfAdapter(){
		DollarAmount dollarAmount = new DollarAmount( 19, 95 );

		FractionalDollarAmount fractionalDollarAmount = new FractionalDollarAmount( 17.89 );

		ArrayList<IDollarAmount> amounts = new ArrayList<>();
		amounts.add( dollarAmount );
		
		DollarAdapter da = new DollarAdapter(fractionalDollarAmount);
		amounts.add(da);
		// Should print 19.95 and 17.89
		System.out.print( "Should print 19.95 and 17.89\n");
		AmountPrinter.printAmounts( amounts );
	}
}






