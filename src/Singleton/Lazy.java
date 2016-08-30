package Singleton;

public class Lazy {
	public static void main(String[] args) {
	}
}

//non thread safe
class Singleton1{
	private static Singleton1 uniqueInstance = null;
	
	private Singleton1(){
	}
	
	public static Singleton1 getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Singleton1();
		}
		return uniqueInstance;
	}
}
