package Interpreter;

public class MultiplyExpression implements Expression {
	private Expression leftSide;
	private Expression rightSide;

	public MultiplyExpression(Expression a, Expression b) {
		leftSide = a;
		rightSide = b;
	}

	public double evaluate() {
		return leftSide.evaluate() * rightSide.evaluate();
	}
}
