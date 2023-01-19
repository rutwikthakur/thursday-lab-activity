//rutwik

package com.Question1;

public class Question1 {

	public static void main(String[] args) {
		int num=123456789;
		int firstDigit=0;
		int lastDigit=0;
		
		//to find the last digit of the number 
		lastDigit=Math.abs(num%10);
		
		//to find the first digit of the number 
		while(num!=0)
		{
			firstDigit=Math.abs(num%10);
			num/=10;
		}
		System.out.println("The first digit of the given number is: "+firstDigit);
		System.out.println("The last digit of the given number is: "+lastDigit);

	}

}
