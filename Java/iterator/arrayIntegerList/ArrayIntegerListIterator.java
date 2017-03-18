package iterator.arrayIntegerList;

class ArrayIntegerListIterator implements IntValIterator {
	private	int current;
	private	int afterEnd;
	private	int [] data;
	
	public ArrayIntegerListIterator(int[] data, int afterEnd) {
		this.data = data;
		this.afterEnd = afterEnd;
		this.current = afterEnd;
	}
	
	public void first() {
		current = 0;
	}
	
	public void next() {
		++current;
	}
	
	public boolean isDone() {
		return current >= afterEnd;
	}
	
	public int currentItem() {
		return data[current];
	}
}