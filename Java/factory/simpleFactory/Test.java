package factory.simpleFactory;

public class Test {
	public static void main(String[] args) {
		CityFactory cm = new CityFactory();
		City c = cm.Factory("Paris");
		c.printName();

	}

}
