//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

package atividades;

import java.util.Scanner;

public class atividade9 {
	public static void main(String[] args) {

		int num, quantimpar = 0, quantpar = 0, impar = 0, par = 0;
		Scanner ler = new Scanner(System.in);

		for (int x = 0; x < 10; x++) {
			System.out.println("Entre com um n�mero: ");
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
		
		System.out.println("\nVoc� digitou " + quantpar + " n�meros pares e " + quantimpar + " n�meros �mpares!");
	}
}
