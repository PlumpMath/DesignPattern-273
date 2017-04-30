package factory.simpleFactory;

public class CityFactory {
	public static City Factory(String name){
		if(name == null){
			System.out.println("input name is null");
			return null;
		}else if(name.equals("Paris")){
			return new Paris();
		}else if(name.equals("Shanghai")){
			return new Shanghai();
		}else{
			System.out.println("no case match" + name);
			return null;
		}
	}
}
