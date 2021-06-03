//Faça um programa que entre com três números e coloque em ordem crescente.

package atividades;

import java.util.Scanner;

public class atividade6 {
	public static void main(String[] args) {
		
		int num1 , num2 , num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o 1º número: ");
		num1 = leia.nextInt();
		System.out.println("Entre com o 2º número: ");
		num2 = leia.nextInt();
		System.out.println("Entre com o 3º número: ");
		num3 = leia.nextInt();
leia.close();
		if (num1>=num2 && num2>=num3) {
			System.out.println(num3 + "," + num2 +  "," + num1);
		}
		else if (num1>=num2 && num2<=num3) {
			System.out.println(num2 + ","+ num3 + ","+ num1);
		}
		else if (num2>num1 && num1>num3) {
			System.out.println(num3 + "," + num1 + "," + num2);
		}
		else if (num2>num3 && num3>num1) {
			System.out.print(num1 +  "," + num3 + "," + num2);
		}
		else if (num3>num2 && num2>num1) {
			System.out.println(num1 + ","+ num2 + "," +num3);
		}
		else {
			System.out.println(num2 + ","+ num1 + ","+ num3);
		}
			
	}

}
