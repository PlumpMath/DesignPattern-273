package factory.abstractFactory;

public class Paris extends City{
	private String name;
	public Paris(){
		name = "Paris";
	}
	public void PrintName(){
		System.out.println(name);
	}
}
