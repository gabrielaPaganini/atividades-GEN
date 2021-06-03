
//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:

package atividades;

import java.util.Scanner;

public class atividade4 {
	public static void main(String[] args) {

		int idade;
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o valor da sua idade: ");
		idade = leia.nextInt();

		leia.close();

		if (idade >= 18 && idade <= 25) {
			System.out.println("\nVocê se encontra na categoria ADULTO");
		} else if (idade < 18 && idade >= 15) {
			System.out.println("\nVocê se encontra na categoria JUVENIL ");
		} else if (idade < 15 && idade > 10) {
			System.out.println("\nVocê se encontra na categoria INFANTIL");
		} else {
			System.out.println("\nVocê não se encontra em nenhuma categoria");
		}
	}
}
