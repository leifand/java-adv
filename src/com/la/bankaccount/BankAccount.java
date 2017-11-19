package com.la.bankaccount;

public class BankAccount {
	
	private static int totalAccounts = 0;
	private static double totalDeposits = 0.0;
	
	private String accountNumber = null;
	private double checkingBalance = 0.0;
	private double savingsBalance = 0.0;
	
	public BankAccount() {;}
	
	private String generateAccountNumber() { return "ihateeclipse";}
	
	
	
}
