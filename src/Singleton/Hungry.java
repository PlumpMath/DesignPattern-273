package Singleton;

public class Hungry {
}

//thread safe
class Singleton4{
	private Singleton4(){
	}
	
	private static final Singleton4 single = new Singleton4();
	
	public static Singleton4 getInstance(){
		return single;
	}
}