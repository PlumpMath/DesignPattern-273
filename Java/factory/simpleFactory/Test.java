package factory.simpleFactory;

public class Test {
	public static void main(String[] args) {
		CityManager cm = new CityManager();
		City c = cm.Factory("Paris");
		c.printName();

	}

}
