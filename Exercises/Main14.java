//"For" structure combined with IF conditional- exercise 1:checking the odd numbers
import java.util.Scanner;

public class Main14 {
	
	public static void main (String[] args) {
		
		System.out.println("Enter a number");

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
				
		for (int i=1;i<=x;i++) {
			
			if (i %2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
		
		
		
