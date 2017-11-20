package com.la.bankaccount;

public class BankAccount {
	
	private static int totalAccounts = 0;
	private static double totalDeposits = 0.0;
	
	private String accountNumber = "";
	private double checkingBalance = 0.0;
	private double savingsBalance = 0.0;

	public BankAccount() {
		totalAccounts++;
		accountNumber = generateAccountNumber();
	}
	
	private String generateAccountNumber() { // from solution, my static initialization was too complicated
		String acc = "";
		int max = 10;
		int min = 0;

		for(int i = 0; i < 10; i++) {
			int random = (int)(Math.random() * max + min);
			acc = acc.concat(String.valueOf(random));
		}
		return acc;
	}
	
	public String getAccountNumber() { return accountNumber; }
	public double getCheckingBalance() { return checkingBalance; }
	public double getSavingsBalance() { return savingsBalance; }
	
	public void depositChecking(double amount) {
		checkingBalance += amount;
		totalDeposits += amount;
	}
	public void depositSavings(double amount) {
		savingsBalance += amount;
		totalDeposits += amount;
	}
}
