package atividade01;

public class pregui�a extends animal {
	private String alimenta�ao;
	private String comportamento;

	public pregui�a(String nome, int idade, String alimenta�ao, String comportamento) {
		super(nome, idade);
		this.alimenta�ao = alimenta�ao;
		this.comportamento = comportamento;
		
	}

	public String getAlimenta�ao() {
		return alimenta�ao;
	}

	public void setAlimenta�ao(String alimenta�ao) {
		this.alimenta�ao = alimenta�ao;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}
	
	public void ImprimirInf() {
		System.out.println("Nome: "+getNome()+"\nIdade: "+getIdade()+"\nAlimenta��o: "+alimenta�ao+"\nComportamento: "+comportamento);
	}
}
