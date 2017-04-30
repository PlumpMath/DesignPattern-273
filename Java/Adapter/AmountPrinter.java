package Adapter;

import java.util.ArrayList;

class AmountPrinter {
	public static void printAmounts( ArrayList<IDollarAmount > amounts ) {
		for(int i = 0; i < amounts.size(); ++i )
			System.out.print( "Amount = " + amounts.get(i).getDollars() + 
					" dollars " + amounts.get(i).getCents() + " cents\n");
	}
}