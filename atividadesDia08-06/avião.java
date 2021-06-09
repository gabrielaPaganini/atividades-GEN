/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto e 
 * apresente as informações deste objeto no console.
 * */
package atividades;

public class avião {
	private String piloto;
	private int passageiros;
	private double valorPassagem;
	
	public avião (String piloto, int passageiros, double valorPassagem)
	{
		this.piloto = piloto;
		this.passageiros = passageiros;
		this.valorPassagem = valorPassagem;
		
	}
	public void imprimirInfo()
	{
		System.out.println("Piloto: "+piloto+"\nQuantidade de passageiros: "+passageiros+"\nValor da passagem: "+valorPassagem);
				
	}


	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public double getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public double getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}
	

}
