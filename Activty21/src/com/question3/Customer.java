package com.question3;

import java.util.Scanner;

public class Customer {
	
		
		   private int accountNumber;
		   private String accountName;
		   private long accountBalance;
		   Scanner sc=new Scanner(System.in);
		   
		    public void createAccount() {
		      System.out.println("Enter account number:");
		   accountNumber=sc.nextInt();
		   System.out.println("Enter name:");
		   accountName=sc.next();
		   System.out.println("Enter account balance:");
		   accountBalance=sc.nextLong();
	}

	    public void setAmount()
	    {
	    	long amt;
	    	
	    	 System.out.println("Enter the amount you want to add in account");
	    	 amt=sc.nextLong();
	    	 
		accountBalance=accountBalance+amt;
	    }
	    public void getAmount()
	    {
	    	 System.out.println("Account Balance"+accountBalance);
	    	 System.out.println("Name of the account holder"+accountName);
	    }
	    
	    public void withDrawAmount()
	    
	    {
	    	  long amt;
	    	  System.out.println("Enter the amount you want to withdraw");
	    	  amt=sc.nextLong();
	    	  if(accountBalance>=amt)
	    	  {
	    		  accountBalance=accountBalance-amt;
	    		  System.out.println("Balance after withdrawal:"+accountBalance);
	    		  
	    	  }
	    	  else
	    	  {  
	    		  System.out.println("Your balance is less than"+amt+"transaction Failed....!");  
	    	  }

	    }
}
