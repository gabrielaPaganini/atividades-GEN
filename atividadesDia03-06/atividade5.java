//Fa�a um programa em que permita a entrada de um n�mero qualquer e 
//exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
//quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

package atividades;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {

		int num, elevad;
		float raiz;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero: ");
		num = leia.nextInt();
		
		leia.close();

		raiz = (float) Math.sqrt(num);
		elevad = num * num;

		if (num % 2 == 0) {
			System.out.println("\nEste � um n�mero par e sua ra�z quadrada �: " + raiz);
		} else {
			System.out.println("\n|Este � um n�mero �mpar e elevado ao quadrado �: " + elevad);
		}
	}
}
