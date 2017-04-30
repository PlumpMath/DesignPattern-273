package factory.factoryMethod;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		CityFactory cf = new ParisFactory();
		City c = cf.createCity();
		c.printName();
		
		CityFactory paris = new ParisFactory();
		List<City> ps = paris.createCities();
		for (City c1 : ps) 
			c1.printName();
	}
}
