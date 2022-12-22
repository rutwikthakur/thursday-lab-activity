package com.Question2;

import javax.naming.InsufficientResourcesException;

public class InSufficientBalanceException {

	private int balance=10000; //balance
	
	public int balance()
	{
		return balance;
	}
	
	public  void withdraw(int amount) throws InsufficientResourcesException
	{
		if(amount>balance)
		{
			throw new InsufficientResourcesException("NO SufficientFundException" ); //if the amount is greater than balance it will , print InSufficientBalanceException
			
		}
		balance=balance-amount;
		
			
	}
	
	public void deposit(int amount)
	{
		if(amount<=0)
		{
			throw new IllegalArgumentException("Invalid deposit amount "+amount);
		}
	}
	public static void main(String[] args) throws InsufficientResourcesException {
		InSufficientBalanceException acct=new InSufficientBalanceException();
		System.out.println("current balance:"+acct.balance());
		System.out.println("Withdrawing 20000");
		acct.withdraw(20000);
		System.out.println("Current balance : " + acct.balance());
       
		

	}
}