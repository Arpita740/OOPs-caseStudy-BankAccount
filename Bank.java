package com.casestudy.a2.set2;

abstract public class Bank {
private int accountId;
private String accHolderName;
private double balance;
public int getAccountId() {
	return accountId;
}

public String getAccHolderName() {
	return accHolderName;
}
public double getBalance() {
	return balance;
}

public Bank(int accountId, String accHolderName,double balance) {
	this.accountId = accountId;
	this.accHolderName = accHolderName;
	this.balance=balance;
}

public void display() {
    System.out.println("Account ID: " + accountId + ", Account Holder: " + accHolderName + ", Balance: " + balance);
}
abstract public double calculateInterest();
abstract public double calculateWithdraw();
}
