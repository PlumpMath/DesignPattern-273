package Singleton;

public class StaticInnerLazy {
	public static void main(String[] args) {
	}
}

//The reason why not using static for Singleton3 is because
//it could avoid pre-creating the instance.
//The instance would be created only when we need it--getInstance().
class Singleton3{ 
	//must be private to avoid being called by other class
	private Singleton3(){
	}
	
	//static inner class ensures it is not exposed to out class.
	//keyword static also ensures there is only one instance.
	//According the JSL standard, the construction of class must be atomic and not concurrent.
	//So, there is no need to use synchronized.
	private static class LazyLoader{
		private static final Singleton3 instance = new Singleton3();
	}
	
	public static final Singleton3 getInstance(){
		return LazyLoader.instance;
	}
}