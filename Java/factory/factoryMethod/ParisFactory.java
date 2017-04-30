package factory.factoryMethod;

public class ParisFactory extends CityFactory {
	public City createCity() {
		return new Paris();
	}
}
