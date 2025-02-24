package aula2;

import java.util.Scanner;

public class N3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c;
		
		System.out.println("Digite o primeiro numero");
		
		a = sc.nextInt();
		
		System.out.println("Digite o segundo numero");
		
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro numero");
		
		c = sc.nextInt();
		
		
		if (a > b && b > c) System.out.println( "A ordem é " + a +"," + b + "," + c); 
		
		else if (a > c && c > b) System.out.println( "A ordem é " + a +"," + c + "," + b);
		
		else if (b > a && a > c) System.out.println( "A ordem é " + b +"," + a + "," + c);
		
		else if (b > c && c > a) System.out.println(" A ordem é " + b +"," + c + "," + a);
		
		else if (c > b && b > a) System.out.println( "A ordem é " + c +"," + b + "," + a);
			
		else if (c > a && a > b) System.out.println( "A ordem é " + b +"," + a + "," + c);	
		sc.close();
		}
		}
		


