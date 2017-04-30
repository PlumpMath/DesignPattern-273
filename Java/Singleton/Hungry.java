package Singleton;

public class Hungry {}

// thread safe, but not lazy loading
class SingletonHungry{
	private SingletonHungry(){}
	
	private static final SingletonHungry instance = 
			new SingletonHungry();
	
	public static SingletonHungry getInstance(){
		return instance;
	}
}