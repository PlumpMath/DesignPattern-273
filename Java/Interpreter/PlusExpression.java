package Interpreter;

public class PlusExpression implements Expression {
	private Expression leftSide;
	private Expression rightSide;

	public PlusExpression(Expression a, Expression b) {
		leftSide = a;
		rightSide = b;
	}

	public double evaluate() {
		return leftSide.evaluate() + rightSide.evaluate();
	}
}
