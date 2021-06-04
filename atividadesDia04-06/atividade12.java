/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
package atividades;

import java.util.Scanner;

public class atividade12 {
	public static void main(String[] args) {
		 int num , soma=0;
		 Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Entre com um número: ");
			num = leia.nextInt();
			soma += num;
		}
		while(num!=0);
		
		leia.close();
		
		System.out.println("A soma dos números digitados é "+ soma);
	}
}
