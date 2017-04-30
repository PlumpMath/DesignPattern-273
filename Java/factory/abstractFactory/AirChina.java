package factory.abstractFactory;

public class AirChina extends Air{
	private String name;
	public AirChina(){
		name = "AirChina";
	}
	public void PrintName(){
		System.out.println(name);
	}
}
