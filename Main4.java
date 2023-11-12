//Exercise to read all inputs until the next line
import java.util.Scanner;

public class Main4 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
//addding the string var before readind the number var		
		int x;
		
		x = sc.nextInt();
		sc.nextLine();  // utilizing this command you make sure that when breaking the like the var s1 will not be compromised
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}
}