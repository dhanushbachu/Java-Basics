package com.java.javabasics;

public class Bank extends Customer{
	
	public class SavingsAccount{
		void msg(){
			System.out.println("I am Savings Account");
		}
	}
	public class RecurringAccount{
		void msg(){
			System.out.println("I am Recurring Account");
		}
	}
	

	public static void main(String[] args) {
		
		Bank b = new Bank();
		Bank.SavingsAccount acc1 = b.new SavingsAccount();
		Bank.RecurringAccount acc2 = b.new RecurringAccount();
		Bank.Saa acc3 = b.new Saa();
		Bank.Asd acc4 = new Bank.Asd();
		acc1.msg();
		acc2.msg();
		acc3.msg();
		acc4.msg();
	}

}
