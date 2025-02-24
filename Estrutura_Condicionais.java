package aula2;

import java.util.Scanner;

public class Estrutura_Condicionais {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		System.out.println("Digite a sua idade");
		idade = sc.nextInt();
		
		if (idade > 59) {
			System.out.println("Ele é idoso");
		}
		
		else if (idade >= 18 && idade < 59){
			
			System.out.println("ele é adulto");
		}else if  (17 > idade ){
				System.out.println("Ele é criança");
		sc.close();}
		
}
	}
	

