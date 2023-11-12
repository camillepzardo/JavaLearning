//List of exercises part 2  (ex 8)
import java.util.Scanner;

public class Main8 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
// Ex 8 - inform how many taxes the employee will pay based on the salary range 
		
		System.out.println("Digite seu salario:");
		double salario = sc.nextDouble();
		double taxa = 0;
	
		if (salario <= 2000.00) {
			taxa = 0;
			System.out.println("Isento de Imposto");
		}
		
		else if (salario <=3000.00) {
			taxa = (salario - 2000)*0.08;
			System.out.printf("Impostos totais: R$ %.2f", (taxa));
		}
		
		else if (salario <= 4500.00) {
			taxa = (salario-3000)*0.18 + (1000*0.08);
			System.out.printf("Impostos totais: R$ %.2f", (taxa));
		}
		
		else if (salario >4500.00) {
			taxa = (salario-4500)*0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("Impostos totais: R$ %.2f", (taxa));
		}
		
		else {
			System.out.printf("R$ %.2f%n", taxa);		
			}
		
		sc.close();
	}
}