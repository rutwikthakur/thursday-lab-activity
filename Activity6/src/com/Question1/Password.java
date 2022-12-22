package com.Question1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your password:"); //enter password
			String Password=sc.next();
			String regex ="[A-Za-z#*@]{8}"; //8 characters must be implemented
			Pattern p=Pattern.compile(regex); 
			Matcher m=p.matcher(Password);
			boolean matchFound=m.find();
			if(matchFound)
				System.out.println("Password is valid and you can continue with online shooping"); //password is correct the it will be print
			else
				System.out.println("Invalid Password.....try agian"); //password not correct then it will print 
		}
		

	}

}