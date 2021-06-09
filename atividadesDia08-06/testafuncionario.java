package atividades;

public class testafuncionario {
	public static void main(String[] args) {

		funcionario[] lista = new funcionario[3];
		lista[0] = new funcionario("Richard", 2600);
		lista[1] = new funcionario("Veneza", 2800);
		lista[2] = new funcionario("Patricia", 3000);

		for (funcionario laço : lista) {
			laço.imprimirInfo();
		}

		System.out.println("---------------------------------");
		for (funcionario laço1 : lista) {
			laço1.aumentarSalario();
			laço1.imprimirInfo();
		}
	}

}
