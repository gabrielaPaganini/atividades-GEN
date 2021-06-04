/* Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
*/
package atividades;

import java.util.Scanner;

public class atividade13 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, tnum = 0, quant = 0, media = 0;

		do {
			System.out.println("Entre com um número: ");
			num = leia.nextInt();
			if (num % 3 == 0) {
				quant++;
				tnum += num;
			}
		} while (num != 0);

		leia.close();
		media = tnum / quant;
		System.out.println("A média dos números múltiplos de 3 é: " + media);
	}
}
