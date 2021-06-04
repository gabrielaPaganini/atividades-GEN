//Ler 10 números e imprimir quantos são pares e quantos são ímpares.

package atividades;

import java.util.Scanner;

public class atividade9 {
	public static void main(String[] args) {

		int num, quantimpar = 0, quantpar = 0, impar = 0, par = 0;
		Scanner ler = new Scanner(System.in);

		for (int x = 0; x < 10; x++) {
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		quantimpar += impar;
		quantpar += par;
		ler.close();
		
		System.out.println("\nVocê digitou " + quantpar + " números pares e " + quantimpar + " números ímpares!");
	}
}
