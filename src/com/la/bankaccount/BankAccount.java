package com.la.bankaccount;

import java.util.Random;

public class BankAccount {
	
	private static int totalAccounts = 0;
	private static double totalDeposits = 0.0;
	private static String nextAccountNumber;
	
	private String accountNumber;
	private double checkingBalance = 0.0;
	private double savingsBalance = 0.0;

	static {
		Random generator = new Random();
		for (int i = 0; i < 10; i++) { 
			nextAccountNumber += generator.nextInt(10); 
		}
	}
	
	public BankAccount() {;}
	
	private static String generateAccountNumber() { return nextAccountNumber;}
	public void setAccountNumber() { accountNumber = generateAccountNumber(); }
	public String getAccountNumber() { return accountNumber; }
	public double getCheckingBalance() { return checkingBalance; }
	public double getSavingsBalance() { return savingsBalance; }
}
