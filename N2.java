package aula2;

import java.util.Scanner;

public class N2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro numero");

		 a = sc.nextInt();
		 
		 System.out.println("Digite o segundo numero");
		 
		 b = sc.nextInt();
	
		 if ( a > b) 
		 {System.out.println("O primeiro numero é maior");
	}if ( b > a) {System.out.println("O segundo numero é maior");
	
	}if (a == b) { System.out.println("os numeros iguais");
}
	sc.close();}
	}