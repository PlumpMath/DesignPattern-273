package factory.factoryMethod;

import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		CityFactory cf = new ParisFactory();
		City c = cf.create();
		c.printName();
		
		ParisFactory paris = new ParisFactory();
		List<City> ps = paris.createCityVector();
		for (City c1 : ps) 
			c1.printName();
	}
}
