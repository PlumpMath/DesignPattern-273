package AbstractFactory;

public class Shanghai extends City{
	private String name;
	public Shanghai(){
		name = "Shanghai";
	}
	public void PrintName(){
		System.out.println(name);
	}
}
