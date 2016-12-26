package Singleton;

public class VolatileSync {
	public static void main(String[] args) {
	}
}

class SingletonClass{
	//why volatile?
	//For example, thread A starts to create the instance of SingletonClass
	//Meanwhile, thread B calls getInstance(), which firstly check whether instance is null or not.
	//But thread A has already referenced instance with some memory.
	//It just does not start the constructor.
	//So, thread B finds instance is not null and therefore returns instance.
	//Here comes the issue.
	//(happens before)The volatile variable can't change the order of read and write code
	private volatile static SingletonClass instance = null; 
	
	//must be private to avoid being called by other class
	private SingletonClass(){}

	public static SingletonClass getInstance() { 
		if (instance == null) { 
			synchronized (SingletonClass.class) { 
				if(instance == null) { 
					instance = new SingletonClass(); 
				} 
			} 
	    }
		return instance;
	}	
}