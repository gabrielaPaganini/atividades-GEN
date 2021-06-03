//Faça um programa que receba três inteiros e diga qual deles é o maior.
package atividades;

import java.util.Scanner;

public class atividade7 {
	public static void main(String[] args) {
		
	int num1 ,num2 ,num3;
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Entre com o 1º número: ");
	num1 = leia.nextInt();
	System.out.println("Entre com o 2º número: ");
	num2 = leia.nextInt();
	System.out.println("Entre com o 3º número: ");
	num3 = leia.nextInt();
	leia.close();
	
		if (num1>=num2 && num1<=num3) {
		System.out.println("\nO maior número é: "+ num1);
		}
		else if (num2>=num1 && num2>=num3) {
		System.out.println("\nO maior número é: "+ num2);
		}
		else {
			System.out.println("\nO maior número é: "+ num3);
		}
	}
}
