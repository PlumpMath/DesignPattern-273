package factory.abstractFactory;

public class ParisTravelFactory implements TravelFactory {
	public City city() {
		return new Paris();
	}
	
	public Air air() {
		return new AirFrance();
	}
}
