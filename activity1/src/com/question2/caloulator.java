package com.question2;
import java.util.Scanner;
public class caloulator {

	public static void main(String[] args) {
		char operator;
		int number1,number2,result;
		//create a scanner class
		Scanner input=new Scanner(System.in);
		
		//ask user to enter operator
		System.out.println("Choose an operator:+,-,*,or/");
		operator=input.next().charAt(0);
		
		System.out.println("Enter first number");
		number1=input.nextInt();
		
		System.out.println("Enter second number");
		number2=input.nextInt();
		
		switch(operator) {
		case '+':
			result=number1+number2;
			System.out.println(number1+"+"+number2+"="+result);
			break;
			   
		case '-':
			result=number1-number2;
			System.out.println(number1+"-"+number2+"="+result);
			break;
			
		case'*':
			result=number1*number2;
			System.out.println(number1+"*"+number2+"="+result);
			break;
			  
			
		case'/':
			result=number1/number2;
			System.out.println(number1+"/"+number2+"="+result);
			break;
			
			   default:
				     System.out.println("invalid operator");
		}

	}

}
