package com.ATM.com;

import java.util.Scanner;

public class ATMInterface {

	private BankAccount account;
	

	public ATMInterface(BankAccount account) {
		
		this.account = account;
	}

	public void Display() {
		
		System.out.println("select options");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw ");
		System.out.println("3. check balance");
		System.out.println("4. leave");
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int options;
		do {
			Display();
			options = sc.nextInt();
			
			switch(options) {
			case 1:
			System.out.println("current balance" + account.balance());
			break;
			
			case 2:
			System.out.println("Enter ammount to deposite");
			int depositAmount = sc.nextInt();
			account.deposite(depositAmount);
			break;
			
			case 3:
			System.out.println("Enter amount to withdraw");
			int withdrawAmount = sc.nextInt();
			account.withdraw(withdrawAmount);
			break;
			
			case 4:
			System.out.println("Thanks for working with axis bank");
			break;
			
			default:
				System.out.println("Invalid entry");
				
			}
			
			}while(options != 4);
		sc.close();
		}
		
	}


class BankAccount{
	
	private int balance;
	
	public BankAccount(int initialAmount) {
		this.balance = 	initialAmount;
}
	
	public int balance() {
		return balance;
	}
	
	public void deposite(int amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposite of " +amount+ "RS was sucessful");
		}
		else {
			System.out.println("Invalid entry!. please choose a number above 0");
		}
	}
	
	public void withdraw(int amount) {
		if(amount > 0 && amount <= balance) {
			System.out.println("withdraw succesfull of " +amount+ "rs ");
			amount -= balance;
		}
		else {
			System.out.println("Invalid entry!!, Insufficent balance or negative value entered");
		}
	}

	public static void main(String[] args) {
		BankAccount useraccount = new BankAccount(300);
		ATMInterface atm = new ATMInterface(useraccount);
        atm.run();
	}

}
