package factory.factoryMethod;

public class ShanghaiFactory extends CityFactory{
	public City create(){
		return new Shanghai();
	}
}
