package aula2;

import java.util.Scanner;

public class N5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a;
		
		System.out.println("Digite o seu numero");
		
		a = sc.nextDouble();
		
		
		if (a > 0) System.out.println("É positivo");
		
		if (a == 0) System.out.println("É igual a zero");
		
		else if (a < 0) System.out.println("É negativo");
		
		
		
		sc.close();
		}

}
