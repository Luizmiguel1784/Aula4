package aula2;

import java.util.Scanner;

public class N4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	int ano;
		System.out.println("Digite um ano");
	
		ano = sc.nextInt();
		
		if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0 )) { System.out.println(ano+" é bissexto");
	
		}else { System.out.println("Não é um ano é bissexto");
	sc.close();}

}
	}
