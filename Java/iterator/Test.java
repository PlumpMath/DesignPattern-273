package iterator;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		String[] sArr = new String[]{"a", "b", "c"};
		Integer[] iArr = new Integer[]{0, 1, 2, 3};
		
		MyObject<String> mo1 = new MyObject<String>(sArr);
		MyObject<Integer> mo2 = new MyObject<Integer>(iArr);
		
		Iterator it = mo1.iterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
		
		System.out.println("\n");
		it = mo2.iterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
	}
}

class MyObject <E> implements Iterable<Object>{
	private E[] value;
	
	public MyObject(){
		value = null;
	}
	
	public MyObject(E[] e){
		value = e;
	}

	public E[] get(){
		return value;
	}
	
	public Iterator iterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator {  
        private int cursor = 0; // 属性的索引  
           
        public boolean hasNext() {  
            return cursor!= value.length;  
        }  
   
        public E next() {  
            return value[cursor++];  
        }  
   
        public void remove() {  
       	    throw new UnsupportedOperationException();          
        }           
    }  
}