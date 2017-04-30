package factory.abstractFactory;

public class ShanghaiTravelFactory implements TravelFactory {
	public City city() {
		return new Shanghai();
	}
	
	public Air air() {
		return new AirChina();
	}
}
