package com.la.calculator;

public class CalculatorTest1 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.getResults());
		
		calc.setOperandA(10.5);
		calc.setOperandB(5.2);
		calc.setOperator("+");
		
		System.out.println(calc.getResults());		
	}
}
