package FactoryMethod;

public class Paris implements City{
	private String name;
	public Paris(){
		name = "Paris";
	}
	
	public void printName(){
		System.out.println(name);
	}
}
