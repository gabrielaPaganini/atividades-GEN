//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 

package atividades;

import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {

		double a=0, b=0, c=0, r, s , d;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o valor de 'a': ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de 'b': ");
		b = leia.nextInt();
		System.out.println("Entre com o valor de 'c': ");
		c = leia.nextInt();
		leia.close();
		r = (int) Math.pow(a + b, 2);
		s = (int) Math.pow(b + c, 2);

		d = (r + s) / 2;
		System.out.println("O valor de D é: " + d);
	}
}
