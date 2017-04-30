package factory.factoryMethod;

public class ShanghaiFactory implements CityFactory {
	public City createCity() {
		return new Shanghai();
	}
}
