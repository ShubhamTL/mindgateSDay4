package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		int transactionChoice;
		double amount;
		boolean result;
		String continueChoice;

		System.out.println("Welcome to XYZ Bank");
		System.out.println("Enter account number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		Account account = new Account(accountNumber, name, balance);

		System.out.println("Account Opened Successfully");
		do {
			System.out.println();
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("Enter your choice");
			transactionChoice = scanner.nextInt();

			switch (transactionChoice) {
			case 1:
				System.out.println("Enter amount to be withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result) {
					System.out.println("Withdraw successful!");
					System.out.println("Balance :: " + account.getBalance());
				} else {
					System.out.println("Withdraw failed!");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;
			case 2:
				System.out.println("Enter amount to be deposit");
				amount = scanner.nextDouble();
				result = account.deposit(amount);
				if (result) {
					System.out.println("deposit successful!");
					System.out.println("Balance :: " + account.getBalance());
				} else {
					System.out.println("deposit failed!");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;
			case 3:
				System.out.println("Balance :: " + account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue ?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
		System.out.println("Thank you for banking with us!");
	}
}
