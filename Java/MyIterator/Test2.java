package MyIterator;

import java.lang.reflect.Field;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		Teacher t = new Teacher();  
        t.setName("aaaaaaa");  
        t.setAge(23); 
        Iterator it = t.iterator();
        while(it.hasNext()) {  
            System.out.println(it.next());  
        }  
	}
}

class Teacher implements Iterable{  
    private String name;  
    private int age;    
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public int getAge() {  
        return age;  
    }  
    public void setAge(int age) {  
        this.age = age;  
    }  
    public Iterator iterator() {  
        return new Itr();  
    }       
      
    private class Itr implements Iterator{  
        private int cursor=0; // 属性的索引  
        private Field[] fields = Teacher.class.getDeclaredFields(); // 属性的数组  
          
        public boolean hasNext() {  
            return cursor!=(Teacher.class.getDeclaredFields().length);  
        }  
  
        public Object next() {  
            Object o=null;  
            try{  
                fields[cursor].setAccessible(true);  // 让内部类可以访问外部类的私有属性的值  
                o = fields[cursor].getName()+" "+fields[cursor].get(Teacher.this);  
                cursor++;  
            }catch(Exception e){  
                System.out.println(e);  
            }   
            return o;  
        }  
  
        public void remove() {      
        }          
    }  
} 