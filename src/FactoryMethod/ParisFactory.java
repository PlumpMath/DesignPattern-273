package FactoryMethod;

public class ParisFactory extends CityFactory{
	public City create(){
		return new Paris();
	}
}
