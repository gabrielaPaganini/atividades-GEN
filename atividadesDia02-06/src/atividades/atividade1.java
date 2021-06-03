//Um sistema de equações lineares:

package atividades;

import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		float a, b, c, d, e, f, x, y , p , l , numx , numy;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o valor de 'a': ");
		a = leia.nextFloat();
		System.out.println("Entre com o valor de 'b': ");
		b = leia.nextFloat();
		System.out.println("Entre com o valor de 'c': ");
		c = leia.nextFloat();
		System.out.println("Entre com o valor de 'd': ");
		d = leia.nextFloat();
		System.out.println("Entre com o valor de 'e': ");
		e = leia.nextFloat();
		System.out.println("Entre com o valor de 'f': ");
		f = leia.nextFloat();

		leia.close();
		

		x = (c * e) - (b * f);
		p = (a * e) - (b * d);
		y = (a * f) - (c * d);
		l = (a * e) - (b * d);
		numx = x/p;
		numy = y/l;
		
		System.out.println("O valor de x é: " + numx);
		System.out.println("O valor de y é: " + numy);

	}
}
