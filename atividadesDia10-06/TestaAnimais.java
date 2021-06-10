package atividade01;

import java.util.Scanner;

public class TestaAnimais {
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);

	cachorro cachorro = new cachorro();
	cavalo cavalo = new cavalo();
	preguica preguica = new preguica();

	
	animal animal = null;
	
	 int x;
	
	do
	{
		System.out.println("\nQual o tipo do seu animal???\n\n1-Cachorro\n2-Cavalo\n3-Preguiça\n");
		 x = leia.nextInt();
		
		if (x == 1) {
			animal = cachorro;
			System.out.println("\nQual o nome do seu cachorro?");
			String nome = leia.next();
			System.out.println("\nQuantos anos seu cachorro tem?");
			int idade = leia.nextInt();
			System.out.println("\nQual som o cachorro emite?");
			String som = leia.next();
			System.out.println("------------------------------------------------------");
			cachorro.Nome(nome);
			cachorro.Idade(idade);
			cachorro.Som(som);
		} else if (x == 2) {
			animal = cavalo;
			System.out.println("\nQual o nome do cavalo?");
			String nome = leia.next();
			System.out.println("\nQuantos o cavalo tem?");
			int idade = leia.nextInt();
			System.out.println("\nQual som o cavalo emite?");
			String som = leia.next();
			System.out.println("------------------------------------------------------");
			cavalo.Nome(nome);
			cavalo.Idade(idade);
			cavalo.Som(som);

		} else if (x == 3) {
			animal = preguica;
			System.out.println("\nQual o nome da sua preguiça?");
			String nome = leia.next();
			System.out.println("\nQuantos anos ela tem?");
			int idade = leia.nextInt();
			String som = leia.next();
			System.out.println("------------------------------------------------------");
			preguica.Nome(nome);
			preguica.Idade(idade);
			preguica.Som(som);

		} else {
			System.out.println("\nInformação Inválida!!!");
		}
	}while(x<=0||x>=4);
	
	leia.close();
}

}
