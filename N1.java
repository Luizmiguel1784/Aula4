package aula2;

import java.util.Scanner;

public class N1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double nota;
		
	System.out.println("Qual a sua nota");
	
	nota = sc.nextDouble();
	
	if ( nota >= 7) {
		System.out.println("Você foi aprovado");
		
	}else if ( nota < 7 ){
			System.out.println("Você foi reprovado");
		
	sc.close();}
	}

	}


