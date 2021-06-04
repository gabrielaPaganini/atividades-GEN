/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
*/
package atividades;

import java.util.Scanner;

public class atividade10 {
	public static void main(String[] args) {

		int id=0 , a = 0, b = 0 ;
		Scanner leia = new Scanner(System.in);
		
		while (id != -99) {
			System.out.println("Digite a sua idade: ");
			id = leia.nextInt();
			if (id < 21 && id>=0) {
				a++;
			} else if (id > 50) {
				b++;
			} 
		}
		leia.close();
		System.out.println("Tem " + a +" pessoas com menos de 20 anos nessa lista!");
		System.out.println("Tem " + b +" pessoas com mais de 50 anos nessa lista!");
		
	}
}
