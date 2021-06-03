//Faça um programa em que permita a entrada de um número qualquer e 
//exiba se este número é par ou ímpar. Se for par exiba também a raiz 
//quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

package atividades;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {

		int num, elevad;
		float raiz;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();
		
		leia.close();

		raiz = (float) Math.sqrt(num);
		elevad = num * num;

		if (num % 2 == 0) {
			System.out.println("\nEste é um número par e sua raíz quadrada é: " + raiz);
		} else {
			System.out.println("\n|Este é um número ímpar e elevado ao quadrado é: " + elevad);
		}
	}
}
