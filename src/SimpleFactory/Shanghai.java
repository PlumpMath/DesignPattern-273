package SimpleFactory;

public class Shanghai implements City{
	private String name;
	public Shanghai(){
		name = "Shanghai";
	}
	
	public void printName(){
		System.out.println(name);
	}
}
