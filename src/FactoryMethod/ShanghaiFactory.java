package FactoryMethod;

public class ShanghaiFactory extends CityFactory{
	public City create(){
		return new Shanghai();
	}
}
