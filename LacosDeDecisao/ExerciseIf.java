package LacosDeDecisao;


/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra 
10-14 infantil
15-17 juvenil
18-25 adulto*/

import java.util.Scanner;

public class ExerciseIf {

	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		if (idade>=10 && idade<=14) {
			
			System.out.println("Você se encontra na categoria infantil");}
				
			else if (idade >14 && idade< 18) 
				
				System.out.println("Você se encontra na categoria juvenil");
				
				if (idade>17 && idade<=25) 
					
					System.out.println("Você se encontra na categoria adulto");
					} 
		
	}

