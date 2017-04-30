package factory.abstractFactory;

/*
 * 抽象工厂模式的缺点是产品族的扩展十分费力。需要增加一个新产品，
 * 则几乎所有的工厂类都需要修改。。
 */
public class Test {
	public static void main(String[] args) {
		TravelFactory tm = new ParisTravelFactory();
		City c = tm.city();
		c.PrintName();
		Air a = tm.air();
		a.PrintName();
	}
}
