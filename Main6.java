//List of exercises part 2 (1 to 6)
import java.util.Scanner;

public class Main6 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

// Ex 1 - check if number is positive or negative		
//		int num;		
//		num = sc.nextInt();
//		if (num < 0) {
//			System.out.print("NEGATIVO");}
//		else {System.out.print("NÃO NEGATIVO");}
		
// Ex 2 - check if number is even or odd
//		int num;
//		num = sc.nextInt();
//		if (num % 2 ==0) {
//			System.out.println("É par");}
//		else {System.out.println("É ímpar");}
		
// Ex 3 - check if a number is a multiple of another
//		int a,b;
//		double resto;
//		System.out.print("Digite o primeiro número:");
//		a = sc.nextInt();
//		System.out.print("Digite o segundo número:");
//		b = sc.nextInt();
//		if (a%b == 0 || b%a ==0) {
//			System.out.println("São múltiplos");}
//		else {	System.out.println("Não são múltiplos");}
		
// Ex 4 - display how game duration
			
//		System.out.print("Hora de início da partida: ");
//		int HI = sc.nextInt();
//		System.out.println("Hora final da partida: ");
//		int HF = sc.nextInt();		
//		int duracao;		
//		if (HI<HF) {duracao = HF - HI;	}
//		else { duracao = 24 - HI + HF; }
// 		System.out.println("O Jogo durou " + duracao + " horas.");
	
// Ex 5 - identify product's code, quantity and calculate the amount to pay		
//		double cod = sc.nextDouble();
//		double qtde = sc.nextDouble();
//		double total;		
//     	if (cod == 1) {	total = 4*qtde;
//			System.out.printf("Total: R$ %.2f", total);	}
//		else if (cod ==2){
//			total = (4.50)*qtde;
//			System.out.printf("Total: R$ %.2f", total);	}
//		else if (cod ==3){
//			total = (5)*qtde;
//			System.out.printf("Total: R$ %.2f", total);	}
//		else if (cod ==4){
//			total = (2)*qtde;
//			System.out.printf("Total: R$ %.2f", total);	}
//		else if (cod ==5){		total = (1.50)*qtde;
//			System.out.printf("Total: R$ %.2f", total);	}
//		else {	System.out.printf("Não tem");}
		
// Ex 6 - read a number and inform the number's interval 
		
		System.out.println("Digite um número:");
		double num = sc.nextDouble();
		
		if (num >= 0 && num <=25) {
			System.out.println("O intervalo é [0,25]");
		}
		else if (num >25 && num<=50) {
			System.out.println("O intervalo é (25,50]");
		}
		else if (num >50 && num <=75) {
			System.out.println("O intervalo é (50,75]");
		}
		else if (num > 75 && num <= 100) {
			System.out.println("O intervalo é (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}
}