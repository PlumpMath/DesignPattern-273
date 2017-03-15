package Interpreter;

public class DivideExpression implements Expression {
	private Expression leftSide;
	private Expression rightSide;

	public DivideExpression(Expression a, Expression b) {
		leftSide = a;
		rightSide = b;
	}

	public double evaluate() {
		return leftSide.evaluate() / rightSide.evaluate();
	}
}
