package com.casestudy.a2.set2;

public class Users {
public static void main(String[] args) {
	Bank s=new SavingsAccount(1,"Arpita",40000);
	Bank c=new CurrentAccount(12,"Anamika",400000);
	Bank fd=new FixedDepositAccount(1,"Sappy",500000);
	System.out.println("Savings Account Details:");
    s.display();
    System.out.println();
    
    System.out.println("Current Account Details:");
    c.display();
    System.out.println();
    
    System.out.println("Fixed Account Details:");
    fd.display();
    System.out.println();
}
}
