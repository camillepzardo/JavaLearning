//List of exercises part 2 
import java.util.Scanner;

public class Main7 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//Ex 7 - check the number in the mathematical quadrant 
		
		System.out.println("Digite X:");
		double X = sc.nextDouble();
		
		System.out.println("Digite Y:");
		double Y = sc.nextDouble();
		
		if (X == 0 && Y ==0) {
			System.out.println("Origem");
		}
		
		else if (X > 0 && Y > 0) {
			System.out.println("Q1");
		}
		
		else if (X > 0 && Y <0) {
			System.out.println("Q4");
		}
		else if (X<0 && Y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q2");
		}
		
		
		sc.close();
	}
}