package com.la.calculator;

import java.io.Serializable;

public class Calculator implements Serializable {
	
	private static final long serialVersionUID = -1821714405293092415L;
	private double operandA = 0.0;
	private double operandB = 0.0;
	private String operator = "";
	
	public Calculator() {;}
	
	public double getResults() {
		if (operator == "+") return operandA + operandB;
		else if (operator == "-") return operandA - operandB;
		else {
			System.out.println("ERROR: operator not recognized");
			return 0.0;
		}
	}
	public double getOperandA() {
		return operandA;
	}
	public void setOperandA(double operandA) {
		this.operandA = operandA;
	}
	public double getOperandB() {
		return operandB;
	}
	public void setOperandB(double operandB) {
		this.operandB = operandB;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
}
