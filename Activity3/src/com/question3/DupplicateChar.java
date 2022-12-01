package com.question3;

import java.util.Scanner;

public class DupplicateChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);    //scanner class
		String s="vaibhav is good boy";
		System.out.println(s);
		System.out.println("Enter the string");

		    String s2=sc.nextLine();
		    System.out.println("After removing the duplicate characters:");  //remove the duplicates
		    for(int i=0;i<s.length();i++)
		    {
		    	boolean b=false;
		    	for(int j=0;j<s2.length();j++)   //logic for removing the duplicates characters
		    	{
		    		if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s2.charAt(j)))
		    		{	
		    			b=true;
		    			break;
		    				
		             }
		    	
		         }
		    	if(b==false)
		    		System.out.print(s.charAt(i));
		    
	}
}

}