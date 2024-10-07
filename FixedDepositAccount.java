package com.casestudy.a2.set2;

public class FixedDepositAccount extends Bank {
	private double balance;
	
	public FixedDepositAccount(int accountId, String accHolderName, double balance) {
		super(accountId, accHolderName,balance);
		this.balance = balance;
	}
	@Override
	 public double calculateInterest() {
		return getBalance() * 0.07; 
		
	}
	 public double calculateWithdraw() {
		return getBalance() * 0.02; 
		 
	 }
	 public void display() {
	        super.display();
	        System.out.println("Account Type: Fixed Deposit, Interest: " + calculateInterest() + ", Withdrawal Fee: " + calculateWithdraw());
	    }

}
