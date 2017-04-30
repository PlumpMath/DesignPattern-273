package factory.factoryMethod;

public class ParisFactory extends CityFactory{
	public City create(){
		return new Paris();
	}
}
