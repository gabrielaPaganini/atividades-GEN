/* Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
*/
package atividades;

import java.util.Scanner;

public class atividade13 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, tnum = 0, quant = 0, media = 0;

		do {
			System.out.println("Entre com um n�mero: ");
			num = leia.nextInt();
			if (num % 3 == 0) {
				quant++;
				tnum += num;
			}
		} while (num != 0);

		leia.close();
		media = tnum / quant;
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + media);
	}
}
