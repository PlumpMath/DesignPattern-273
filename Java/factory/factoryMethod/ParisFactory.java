package factory.factoryMethod;

public class ParisFactory implements CityFactory {
	public City createCity() {
		return new Paris();
	}
}
