package atividades;

public class testafuncionario {
	public static void main(String[] args) {

		funcionario[] lista = new funcionario[3];
		lista[0] = new funcionario("Richard", 2600);
		lista[1] = new funcionario("Veneza", 2800);
		lista[2] = new funcionario("Patricia", 3000);

		for (funcionario la�o : lista) {
			la�o.imprimirInfo();
		}

		System.out.println("---------------------------------");
		for (funcionario la�o1 : lista) {
			la�o1.aumentarSalario();
			la�o1.imprimirInfo();
		}
	}

}
