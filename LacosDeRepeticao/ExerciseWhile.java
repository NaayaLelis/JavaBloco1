package LacosDeRepeticao;

import java.util.Scanner;

/* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE) */

public class ExerciseWhile {

	public static void main(String[] args) { 
		
	Scanner ler = new Scanner (System.in);
		int idade=0, menor=0, maior=0;
				
		
		
		
		while(idade!=-99) {
			System.out.println("Digite uma50	 idade");
			idade= ler.nextInt();
			
			if (idade< 21) {
				
				menor++ ;  }
			
			else if (idade>50 && idade!=-99) 
					
					maior++;
				           }
			               
			
		System.out.println("O total de pessoas menores de 21 anos é de: " + menor + " . E o total de pessoas maiores de 50 anos é de : " + maior);
		                
		
		                 }
								            }