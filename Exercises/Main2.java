// Exercise of data inputs

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
//associating the object sc (scanner) to what will be entry
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.printf("Voçê digitou a palavra %s, o numero inteiro %d, e o numero decimal %.3f", x,y,z);
		
		sc.close();
		
	}
}
