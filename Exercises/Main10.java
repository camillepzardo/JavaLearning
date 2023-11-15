
//"While" structure - the code returns from the top if the number is not zero, and at the end displays the sum of the entered numbers

import java.util.Scanner;

public class Main10 {
	
	public static void main (String[] args) {
		
		System.out.println("Inser as many numbers as you want, to end it press zero:");

		Scanner sc = new Scanner (System.in);		
		
		int x = sc.nextInt();
		int sum = 0;
		
		while (x != 0) {
			
			sum = sum + x;
// another way to write : sum += x;
			
 			x = sc.nextInt();
		}
		System.out.println("Here is the sum of the numbers you entered: "+sum);
		sc.close();
	}
}
