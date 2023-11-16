//"While" structure - exercise 1: this code reads the password and display if it's 
// a valid password

import java.util.Scanner;

public class Main11 {
	
	public static void main (String[] args) {
		
		System.out.println("Enter the password");

		Scanner sc = new Scanner (System.in);		
		
		int pass = sc.nextInt();
			
		while (pass != 2002) {
			
			System.out.println("The password " + pass + " is invalid");
			System.out.println("Enter a new password");			
			pass = sc.nextInt();
		}
		
		System.out.println("Valid Password");
		
		sc.close();
	}
}