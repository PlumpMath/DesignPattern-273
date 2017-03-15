package Interpreter;

public class Constant implements Expression {
	private double value;

	public Constant(double d) {
		value = d;
	}

	public double evaluate() {
		return getV();
	}
	
	public double getV() {
		return value;
	}
}
