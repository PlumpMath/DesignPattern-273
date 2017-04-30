package factory.factoryMethod;

public class ShanghaiFactory extends CityFactory {
	public City createCity() {
		return new Shanghai();
	}
}
