package com.la.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.setAccountNumber();
		a2.setAccountNumber();
		
		System.out.println(a1.getAccountNumber());
		System.out.println(a2.getAccountNumber());

	}

}
