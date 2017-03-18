package iterator.arrayIntegerList;

class ArrayIntegerList implements List {
	public static final int dataSize = 10;
	private	int integers[] = new int[dataSize];
	
	ArrayIntegerList() {
		count = 0;
	}
	
	public void addInteger (int number) {
		if ( count >= 9 )
			throw new Error("list full");
		integers[count] = number;
		++count;
	}
	
	public void removeInteger () {
		if ( count <= 0 )
			throw new Error("removing from empty list");
		--count;
	}
	
	public IntValIterator createIterator() {
		return new ArrayIntegerListIterator( integers, count );
	}

	int count;
}