package AbstractFactory;

public class ShanghaiTravelManager extends AbstractTravelManager{
	public City createCity(){
		return new Shanghai();
	}
	public Air flyTo(){
		return new AirChina();
	}
}
