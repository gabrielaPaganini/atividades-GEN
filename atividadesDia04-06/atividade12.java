/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
*/
package atividades;

import java.util.Scanner;

public class atividade12 {
	public static void main(String[] args) {
		 int num , soma=0;
		 Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Entre com um n�mero: ");
			num = leia.nextInt();
			soma += num;
		}
		while(num!=0);
		
		leia.close();
		
		System.out.println("A soma dos n�meros digitados � "+ soma);
	}
}
