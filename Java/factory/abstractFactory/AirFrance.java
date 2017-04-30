package factory.abstractFactory;

public class AirFrance extends Air {
	private String name;
	
	public AirFrance() {
		name = "AirFrance";
	}
	
	public void PrintName() {
		System.out.println(name);
	}
}
