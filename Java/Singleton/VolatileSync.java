package Singleton;

public class VolatileSync {}

class SingletonVolatileSync{
	// Why volatile?
	// For example, thread A starts to create the instance of SingletonClass
	// Meanwhile, thread B calls getInstance(), which firstly check whether 
	// instance is null or not. But thread A has already referenced instance 
	// with some memory. It just does not start the constructor. So, thread B 
	// finds instance is not null and therefore returns instance. 
	// (happens before)volatile variable can't change the order of read and write.
	private volatile static SingletonVolatileSync instance = null; 
	
	// be private to avoid being called by other class
	private SingletonVolatileSync(){}

	public static SingletonVolatileSync getInstance() { 
		if (instance == null) { 
			synchronized (SingletonVolatileSync.class) { 
				if(instance == null) { 
					instance = new SingletonVolatileSync(); 
				} 
			} 
	    }
		
		return instance;
	}	
}