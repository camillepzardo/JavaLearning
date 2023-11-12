//List of exercises part 1

import java.util.Scanner;

public class Main5 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

// Ex. 1: reading two number and presenting their sum
//		int x,y,resultado;
//		x = sc.nextInt();
//		sc.nextLine();
//		y = sc.nextInt();
//		System.out.printf("Você digitou primeiro o número: %d%n",x);
//		System.out.printf("Você digitou depois o número: %d%n",y);
//		resultado = x + y;		
//		System.out.printf("O resultado dessa soma é: %d", resultado);
	
// Ex 2: calculate circle area		
//		double raio,pi, formula;				
//		raio = sc.nextDouble();		
//		pi = 3.14159;
//		formula = pi*Math.pow(raio, 2.0);		
//		System.out.printf("A área do cículo é: %.4f%n", formula);
		
// Ex 3: reading 3 numbers and calculating the difference		
//		int a,b,c,d,DIR;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		d = sc.nextInt();		
//		DIR = a*b-c*d;		
//		System.out.println("Diferença= "+ DIR);
				
// Ex 4: reading employee number and calculating the salary
//		double NumFunc, HT, VH, Salario;
//		NumFunc = sc.nextDouble();
//		HT = sc.nextDouble();
//		VH = sc.nextDouble();
//		Salario = HT*VH;		
//		System.out.println("Numero funcionario: "+NumFunc);
//		System.out.printf("Salario: $ %.2f%n", Salario);
		
//Ex 5 - calculating the total payment amount
		
//		int codpec1, np1, codpec2, np2; 
//		double valorunitpec1, valorunitpec2, total;
//		codpec1 = sc.nextInt();
//		np1 = sc.nextInt();
//		valorunitpec1 = sc.nextDouble();
//		codpec2 = sc.nextInt();
//		np2 = sc.nextInt();
//		valorunitpec2 = sc.nextDouble();
//		total = np1*valorunitpec1+np2*valorunitpec2;	
//		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
//Ex 6 - calculating areas of different geometric forms	
		
		double A,B,C;
		double Atri, pi, Acirc, Atrap, Aquad, Aret;
		
		pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		Atri = A*C/2.0;
		Acirc = pi*Math.pow(C, 2.0);	
		Atrap = (A+B)/2.0*C;
		Aquad = Math.pow(B, 2.0);
		Aret = A*B;

		System.out.printf("TRIÂNGULO: %.3f%n",Atri);		
		System.out.printf("CÍRCULO: %.3f%n", Acirc);
		System.out.printf("TRAPÉZIO: %.3f%n", Atrap);
		System.out.printf("TRAPÉZIO: %.3f%n", Aquad);
		System.out.printf("TRAPÉZIO: %.3f%n", Aret);
		
		sc.close();
	}
}