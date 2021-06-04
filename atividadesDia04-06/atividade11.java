/* 4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
*/
package atividades;

import java.util.Scanner;

public class atividade11 {
	public static void main(String[] args) {
		int id, sexo, f = 0, m = 0, o = 0, PN = 0, PC = 0, PA = 0, est = 0, x = 1, MN = 0, HA = 0, OC = 0, PN40 = 0,
				PC18 = 0;
		Scanner leia = new Scanner(System.in);

		while (x <= 150) {
			x++;
			System.out.println("Digite a sua idade: ");
			id = leia.nextInt();

			System.out.println("Indique o seu sexo através do numeral: \n1 - feminino \n2 - masculino \n3 - outros ");
			sexo = leia.nextInt();
			if (sexo == 1) {
				f++;
				if (est == 2) {
					MN++;
				}
			} else if (sexo == 2) {
				m++;
				if (est == 3) {
					HA++;
				}
			} else {
				o++;
				if (est == 1) {
					OC++;
				}
			}

			System.out.println("Digite: \n1 - se você é calmo(a). \n2 - se você é nervoso(a) \n3 - se você é \r\n"
					+ "agressivo(a)");
			est = leia.nextInt();
			if (est == 1) {
				PC++;
				if (id < 18) {
					PC18++;
				}
			} else if (est == 2) {
				PN++;
				if (id > 40) {
					PN40++;
				}
			} else {
				PA++;
			}

		}
		leia.close();
		System.out.println("A pesquisa foi realizada com 150 pessoas, sendo " + f + " mulheres, " + m + " homens e " + o + " outros");
		System.out.println("Dessas 150 pessoas, " + PN + " se dizem nervosas e " + PA + " se dizem agressivas!");
		System.out.println("O número de pessoas calmas: " + PC);
		System.out.println("O número de mulheres nervosas: " + MN);
		System.out.println("O número de homens agressivos: " + HA);
		System.out.println("O número de outros calmos: " + OC);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + PN40);
		System.out.println("O número de pessoas calmas com menos de 18 anos: " + PC18);
	}

}
