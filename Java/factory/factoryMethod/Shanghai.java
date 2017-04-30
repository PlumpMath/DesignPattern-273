package factory.factoryMethod;

public class Shanghai extends City {
	private String name;
	
	public Shanghai() {
		name = "Shanghai";
	}
	
	public void printName() {
		System.out.println(name);
	}
}