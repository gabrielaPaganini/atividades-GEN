package atividade01;

public class preguiça extends animal {
	private String alimentaçao;
	private String comportamento;

	public preguiça(String nome, int idade, String alimentaçao, String comportamento) {
		super(nome, idade);
		this.alimentaçao = alimentaçao;
		this.comportamento = comportamento;
		
	}

	public String getAlimentaçao() {
		return alimentaçao;
	}

	public void setAlimentaçao(String alimentaçao) {
		this.alimentaçao = alimentaçao;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}
	
	public void ImprimirInf() {
		System.out.println("Nome: "+getNome()+"\nIdade: "+getIdade()+"\nAlimentação: "+alimentaçao+"\nComportamento: "+comportamento);
	}
}
