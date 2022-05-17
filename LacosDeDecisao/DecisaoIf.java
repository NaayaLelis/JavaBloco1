package LacosDeDecisao;

/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

import java.util.Scanner;

public class DecisaoIf {

public static void main(String args[]) {

	Scanner ler = new Scanner (System.in);
	int n1, n2, n3; 
	
	System.out.println("Digite um número");
	n1=ler.nextInt();
	
	System.out.println("Digite um número");
	n2=ler.nextInt();
	
	System.out.println("Digite um número");
	n3=ler.nextInt();
	
	if (n1 > n2 && n1 > n3) {
		System.out.println("O maior valor digitado foi: " + n1);
	}
	
	else if (n2 > n1 && n2> n3) {
		System.out.println("O maior valor digitado foi: " +n2 );
	}
	
	else {
		System.out.println("O maior valor digitado foi: " +n3);
	}
}
                           }
