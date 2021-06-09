package atividade01;

public class animal {
	protected String nome;
	protected int idade;
	
	public animal (String nome, int idade) 
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome: " +nome+ "\nIdade: " +idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
	