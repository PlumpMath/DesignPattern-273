package Interpreter;

// Demo the use of an Interpreter to represent a recursive grammar
// In this case a methematical grammar is created 

// Make formula equal to an expression which represents the following tree:
//  ( (A+B) * C ) / k 
// Where a=5.0,b=3.0,c=8.0 are doubles, and k=2.0 is a constant
// Implement the required members to make the program print the following:

// Next set c=7.0, revaluate the expression, to make the program print the following
// Result of ((5.0 + 3.0 ) * 7.0)/2.0 = 28.0

public class Example {
	public static void main(String[] args) {
		demoUseOfInterpreter();
	}

	public static void demoUseOfInterpreter() {
		Variable a = new Variable("A");
		Variable b = new Variable("B");
		Variable c = new Variable("C");
		a.setValue(5.0);
		b.setValue(3.0);
		c.setValue(8.0);
		Constant k = new Constant(2.0);
		
		PlusExpression pEX = new PlusExpression(a, b);
		MultiplyExpression mEx = new MultiplyExpression(pEX, c);
		
		Expression formula = new DivideExpression(mEx, k);
		
		// Should print
		// Result of ((5.0 + 3.0 ) * 8.0)/2.0 = 32.0
		System.out.print("Result of ((" + a.evaluate() + " + " + b.evaluate() + " ) * " + c.evaluate() + ")/2.0 = ");
		System.out.println( formula.evaluate() );

		c.setValue(7.0);
		// Should print
		// Result of ((5.0 + 3.0 ) * 8.0)/2.0 = 28.0
		System.out.print("Result of ((" + a.evaluate() + " + " + b.evaluate() + " ) * " + c.evaluate() + ")/2.0 = ");
		System.out.println( formula.evaluate() );
	}
}

