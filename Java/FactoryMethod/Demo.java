package FactoryMethod;

public class Demo {
	public static void main(String[] args) {
		CityFactory cf = new ParisFactory();
		City c = cf.create();
		c.printName();
	}
}
