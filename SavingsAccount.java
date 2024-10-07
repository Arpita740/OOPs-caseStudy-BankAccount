package com.casestudy.a2.set2;

public class SavingsAccount extends Bank{
private double balance;
	public SavingsAccount(int accountId, String accHolderName,double balance) {
		super(accountId, accHolderName,balance);
		// TODO Auto-generated constructor stub
		
	}
	@Override
	 public double calculateInterest() {
		return getBalance()*0.05;
		
	}
	 public double calculateWithdraw() {
		return getBalance()*0.02;
		 
	 }
	 public void display() {
	        super.display();
	        System.out.println("Account Type: Savings, Interest: " + calculateInterest() + ", Withdrawal Fee: " + calculateWithdraw());
	    }

}
