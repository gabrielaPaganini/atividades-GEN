// 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

package atividades;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {
		int dias, anos, meses, sobra;

		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos dias de vida você tem?");
		dias = leia.nextInt();

		anos = dias / 365;

		meses = (dias % 365) / 30;

		sobra = (dias % 365) % 30;

		leia.close();
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + sobra + " dias!");
	}

}
