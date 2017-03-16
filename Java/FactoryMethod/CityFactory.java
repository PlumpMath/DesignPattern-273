package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CityFactory {
	public abstract City create();
	
	public List<City> createCityVector() {
		List<City> cities = new ArrayList<City>();
		for (int i = 0; i < 10; ++i) {
			City c = create();
			cities.add(c);
		}
		return cities;
	}

}
