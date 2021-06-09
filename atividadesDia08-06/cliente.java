/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
em seguida crie um objeto cliente, 
defina as instancias deste objeto e apresente as informações deste objeto no console.
*/
package atividades;

public class cliente {
	private String nome;
	private float valor;
	private String sexo;
	
	public cliente (String nome, String sexo , float valor)
	{
		this.nome = nome;
		this.sexo = sexo;
		this.valor = valor;
	}
	public void imprimirInfo()
	{
		System.out.println("cliente: "+nome+"\nSexo: "+sexo+"\nValor total do pedido: "+valor);
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
