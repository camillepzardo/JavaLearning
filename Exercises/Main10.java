
//"While" structure - the code returns from the top if the number is not zero,
// at the end display the sum of the entered numbers

import java.util.Scanner;

public class Main10 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		int sum = 0;
		
		while (x != 0) {
			
			sum = sum + x;
// another way to write : sum += x;
			
 			x = sc.nextInt();
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}