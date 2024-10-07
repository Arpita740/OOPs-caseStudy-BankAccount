package com.casestudy.a2.set2;

public class CurrentAccount extends Bank{
	private double balance;
	public CurrentAccount(int accountId, String accHolderName, double balance) {
		super(accountId, accHolderName,balance);
		this.balance = balance;
	}

	@Override
	public double calculateInterest() {
        return getBalance() * 0.02;  
    }

    @Override
    public double calculateWithdraw() {
        return getBalance() * 0.01;  
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Account Type: Current, Interest: " + calculateInterest() + ", Withdrawal Fee: " + calculateWithdraw());
    }

}
