package factory.abstractFactory;

public class ParisTravelManager extends AbstractTravelManager{
	public City createCity(){
		return new Paris();
	}
	public Air flyTo(){
		return new AirFrance();
	}
}
