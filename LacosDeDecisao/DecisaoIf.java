package LacosDeDecisao;

/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

import java.util.Scanner;

public class DecisaoIf {

public static void main(String args[]) {

	Scanner ler = new Scanner (System.in);
	int n1, n2, n3; 
	
	System.out.println("Digite um n�mero");
	n1=ler.nextInt();
	
	System.out.println("Digite um n�mero");
	n2=ler.nextInt();
	
	System.out.println("Digite um n�mero");
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
