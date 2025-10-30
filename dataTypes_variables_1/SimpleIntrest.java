package dataTypes_variables_1;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Scanner getValue = new Scanner(System.in);
		  
		  System.out.println("Enter your pricenpal amount ?"); 
		  int principal = getValue.nextInt();
		  
		  System.out.println("Enter the rate of intrest ?"); 
		  float intrestRate =getValue.nextInt();
		  
		 
		  System.out.println("Enter the time duration ?"); 
		  int time = getValue.nextInt();
		 

		
		//int principal = 10000; float intrestRate = 5f; int time = 10;
		 

		float Reteofintrest = (principal * intrestRate * time) / 100;

		System.out.println("The intrest is " + Reteofintrest);
	}

}
