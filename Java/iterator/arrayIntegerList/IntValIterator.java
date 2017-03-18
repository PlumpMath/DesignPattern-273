package iterator.arrayIntegerList;

interface IntValIterator { // Iterator
	public void first();
	public void next();
	public boolean isDone();
	public int currentItem();
}