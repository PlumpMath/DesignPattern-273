package Interpreter;

public class Variable implements Expression {
	private String name;
	private double value;

	public Variable(String name) {
		this.name = name;
	}

	public void setValue(double d) {
		value = d;
	}
	
	public double getV() {
		return value;
	}

	public double evaluate() {
		return getV();
	}
}
