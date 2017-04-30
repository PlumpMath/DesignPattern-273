package iterator.arrayIntegerList;

//This demos the use of the classic iterator pattern to iterate over all the elements of a container

//You have a class ArrayIntegerList  with the following functions:
//virtual void addInteger ( int number ) : adds an integer to the list
//virtual void removeInteger (  ) : removes an integer from the list
//virtual IntValIterator* createIterator() : creates an iterator to let users iterate and use values of the list
//This class cannot have a print method
//This class is hard coded to hold up to 10 integers, in an int array member

//Create the iterator class for ArrayIntegerList, and have the createIterator function return it.
//Complete the printList function of class Example to print the list using the given iterator

public class Test  {  // client
	public static void main(String[] args) {
		ArrayIntegerList arrayIntegerList = new ArrayIntegerList();
		IntValIterator iterator;

		iterator = arrayIntegerList.createIterator();
        // should print "Printing List:", but no numbers
		printList( iterator );

		arrayIntegerList.addInteger(1);
		arrayIntegerList.addInteger(2);
		arrayIntegerList.addInteger(3);
		arrayIntegerList.addInteger(4);
		arrayIntegerList.addInteger(5);
		arrayIntegerList.removeInteger();

        // should print "Printing List:1 2 3 4"
		iterator = arrayIntegerList.createIterator();
		printList( iterator );
		}
		
	
	public static void printList(IntValIterator iterator) {
		System.out.println("Printing List:");
		iterator.first();
		while(!iterator.isDone()) {
			System.out.print(iterator.currentItem() + " ");
			iterator.next();
		}
		System.out.println();
	}
}