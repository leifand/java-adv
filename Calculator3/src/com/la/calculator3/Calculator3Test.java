package com.la.calculator3;

public class Calculator3Test {

	public static void main(String[] args) {
		Calculator3 c = new Calculator3();
		c.performOperation(10);
		c.performOperation("*");
		c.performOperation(2);
		c.performOperation("-");
		c.performOperation(5);
		c.performOperation("*");
		c.performOperation(7);
		c.performOperation("-");
		c.performOperation(5);
		c.performOperation("-");
		c.performOperation(5);
		c.performOperation("*");
		c.performOperation(5);
		c.performOperation("*");
		c.performOperation(5);
		c.performOperation("/");
		c.performOperation(5);
		c.performOperation("+");
		c.performOperation(20);
		c.performOperation("=");
		System.out.println(c.getResults());
	}
}
