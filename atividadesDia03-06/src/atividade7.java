//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
package atividades;

import java.util.Scanner;

public class atividade7 {
	public static void main(String[] args) {
		
	int num1 ,num2 ,num3;
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Entre com o 1� n�mero: ");
	num1 = leia.nextInt();
	System.out.println("Entre com o 2� n�mero: ");
	num2 = leia.nextInt();
	System.out.println("Entre com o 3� n�mero: ");
	num3 = leia.nextInt();
	leia.close();
	
		if (num1>=num2 && num1<=num3) {
		System.out.println("\nO maior n�mero �: "+ num1);
		}
		else if (num2>=num1 && num2>=num3) {
		System.out.println("\nO maior n�mero �: "+ num2);
		}
		else {
			System.out.println("\nO maior n�mero �: "+ num3);
		}
	}
}
