//author:Rutwik 
//code display the placement
package com.question1;
import java.util.Scanner;
public class Placement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the number of students placed in CES:");
         int CSE=s.nextInt();
         System.out.println("Enter the number of students placed in IT:");
         int IT=s.nextInt();
        		 System.out.println("Enter the number of students placed in MECH:");
         int MECH=s.nextInt();
         
         if(CSE==IT && IT==MECH && CSE==MECH)
         {
        	 System.out.println("none of the department has got the highest placement");
         }
         else if (CSE>=0 && IT>=0 && CSE>=0)
         {
        	 if(MECH>IT && MECH>IT)
        		 {
        		 System.out.println("Highest placement MECH"); 
        	 }
        	 else if(CSE>MECH && CSE>IT)	
        	 {
        		 System.out.println("Highest placement CSE");
        	 }
        	 else if(IT>MECH && IT>CSE)
        	 {
        		 System.out.println("Highest placement IT");
        	 }
        	 else if(IT==MECH) 
        	 {
        		 System.out.println("Higgest placement \nIT \nMECH");
        	 }
        	 else if(CSE==IT)
         
         {
    		 System.out.println("Higgest placement \nCSE \nIT");
    	 }
    	 else if(CSE==MECH)
    	 {
    		 System.out.println("Higgest placement \nCSE \nMECH");
    	 }
    	 else if(CSE==IT)
    	 {
    		 System.out.println("Invalid input");
    	 }
     }
	
	}

}
