package factory.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CityFactory {
	public abstract City createCity();
	
	public List<City> createCities() {
		List<City> cities = new ArrayList<City>();
		for (int i = 0; i < 10; ++i) {
			City c = createCity();
			cities.add(c);
		}
		
		return cities;
	}
}
