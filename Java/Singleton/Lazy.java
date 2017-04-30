package Singleton;

public class Lazy {}

// not thread safe
class SingletonLazy{
	private static SingletonLazy instance = null;
	
	private SingletonLazy(){}
	
	public static SingletonLazy getInstance(){
		if(instance == null)
			instance = new SingletonLazy();
			
		return instance;
	}
}
