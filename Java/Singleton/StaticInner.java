package Singleton;

public class StaticInner {}

// Why not using static for Singleton3 constructor is because
// it could avoid pre-creating the instance. The instance would 
// be created only when we need it (getInstance()).
class SingletonStaticInner{ 
	// be private to avoid being called by other class
	private SingletonStaticInner(){}
	
	// static inner class ensures it is not exposed to out class.
	// Keyword static also ensures there is only one instance.
	// According JSL standard, the construction of class must be 
	// atomic and not concurrent. So, no need to use synchronized.
	private static class Loader{
		private static final SingletonStaticInner instance = 
				new SingletonStaticInner();
	}
	
	public static final SingletonStaticInner getInstance(){
		return Loader.instance;
	}
}