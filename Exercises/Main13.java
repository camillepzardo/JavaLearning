//"While" structure - exercise 2: read gas type and inform the count 
import java.util.Scanner;

public class Main13 {
	
	public static void main (String[] args) {
		
		System.out.println("Add the gas code:");

		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int diesel = 0;
		int gas = 0;
		
		int code = sc.nextInt();
		
		while (code !=4) {
			
			if (code == 1) {
				alcool = alcool + 1;
			}
			else if (code == 2) {
				gas = gas + 1;
			}
			else if (code == 3) {
				diesel = diesel + 1; 
			}
			
		code = sc.nextInt();		 
		}
		
		System.out.println("Thank you");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gas: "+ gas);
		System.out.println("Diesel: "+ diesel);
		
		sc.close();
	}
	
}
		
		
		
