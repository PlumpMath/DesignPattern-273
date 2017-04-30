package factory.abstractFactory;

public class Demo {
	public static void main(String[] args) {
		AbstractTravelManager tm = new ParisTravelManager();
		City c = tm.createCity();
		c.PrintName();
		Air a = tm.flyTo();
		a.PrintName();

	}

}
