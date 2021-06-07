//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package atividades;

import java.util.Scanner;

public class atividade15 {
	public static void main(String[] args) {
		
		int [][] mat = new int [3][3];
		int l, c, vm=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0; l<3; l++) {
			for(c=0; c<3; c++) {
				System.out.println("Entre com um número: ");
				mat[l][c] = leia.nextInt();
					if(mat[l][c]>=10) {
						vm ++;
					}
			}
		}
		
		
		System.out.println("Ela possui "+ vm + " valores maiores que 10!");
		
	}
}
