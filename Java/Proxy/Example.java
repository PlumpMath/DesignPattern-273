package Proxy;

//This example will demo using a proxy to an object serialized to a int[] buffer
//It will show automatic persistance of an object into a buffer , and 
//allowing the serialized object to be used in the same functions that use a regular object

//You have a class called DollarAmount that has the following methods:getCents,setCents,getDollars,setDollars,print
//This class has two private int members, dollars and cents 

//You have a class called DollarPrinter that has a method incrementAndPrintDollar
//This method can accept either a regular DollarObject or a BufferedDollarObject, increment its cents by 1, and print it.

//Create a class called BufferPersistedDollarAmount that will be a proxy for a real DollarOBject
//This class will add persistance capabilities to the real dollar object: it will save its values into 
//a memory int[] buffer sent into its constructor 
//IMPORTANT: this class MUST be a proxy to a real DollarObject instance given from outside the class,  
//but must also back up the values of the real DollarObject in its own buffer

class Example { // client
	public static void main(String[] args) {
		// Create a regular dollar object, increment and print it
		DollarAmount dollarAmount = new DollarAmount();
		dollarAmount.setDollars(18);
		dollarAmount.setCents(50);
		DollarPrinter.incrementAndPrintDollar(dollarAmount);

		// Create a buffered dollar proxy on top of the regular object,
		// increment it , print it
		int buffer[] = { 0, 0 };
		BufferPersistedDollarAmount bufferPersistedDollarAmount = new BufferPersistedDollarAmount(
						buffer, dollarAmount);
		DollarPrinter.incrementAndPrintDollar(bufferPersistedDollarAmount);

		// Show that the buffer is a backup of the DollarObject
		System.out.println("Buffer[0] = " + buffer[0]);
		System.out.println("Buffer[1] = " + buffer[1]);
	}
}