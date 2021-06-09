package atividade01;

public class cachorro extends animal {

	private String truques;
	private String comportamento;
	private String pelos;


	public cachorro(String nome, int idade, String truques, String comportamento, String pelos) {
		super(nome, idade);
		this.comportamento = comportamento;
		this.truques = truques;
		this.pelos = pelos;
	}

	public String getTruques() {
		return truques;
	}

	public void setTruques(String truques) {
		this.truques = truques;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}

	public String getPelos() {
		return pelos;
	}

	public void setPelos(String pelos) {
		this.pelos = pelos;
	}

		public void ImprimirInfo() {
			System.out.println("Nome: "+getNome()+ "\nIdade: "+getIdade()+ "\nTruques: "+truques+"\nComportamento: "+comportamento+"\nTipo da pelagem: "+pelos);
		}
}