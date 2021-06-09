package atividade01;

public class cavalo extends animal {
	private String patas;
	private String cabelo;
	private String acessorio;
	
	public cavalo(String nome, int idade, String patas, String cabelo, String acessorio) {
		super(nome, idade);
		this.patas = patas;
		this.cabelo = cabelo;
		this.acessorio = acessorio;
		
	}
	

	public String getPatas() {
		return patas;
	}

	public void setPatas(String patas) {
		this.patas = patas;
	}

	public String getCabelo() {
		return cabelo;
	}

	public void setCabelo(String cabelo) {
		this.cabelo = cabelo;
	}

	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}
	
	public void ImprimirInfo() {
		System.out.println("Nome: "+getNome()+"\nIdade: "+getIdade()+"\nTipo de patas: "+patas+"\nTipo de cabelo: "+cabelo+"\nAcessórios: "+acessorio);
	}
	
}

