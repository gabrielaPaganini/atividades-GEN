package atividades;

import java.util.Scanner;

public class atividade14 {
	public static void main(String[] args) {

		int[] num = new int[6];
		int somapar = 0, somaimpar = 0, x;

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < num.length; x++) {
			System.out.println("Entre com um número: ");
			num[x] = leia.nextInt();
			if (num[x] % 2 == 0) {
				somapar += num[x];
			} else {
				somaimpar++;
			}
		}
	
		for (x=0; x<num.length; x++) {
			if (num[x] % 2 == 0) {
				System.out.println("O número " + num[x]+ " é par.");
			} else {
				System.out.println("O número " + num[x]+ " é ímpar.");
			}
		}
	
		System.out.println("A soma dos números pares digitados: " + somapar);
		System.out.println("A quantidade de números ímpares digitados: " + somaimpar);
		
		

	}
}
