/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto funcionário, defina as instancias deste objeto e 
 * apresente as informações deste objeto no console.
 */

package atividades;

import java.text.NumberFormat;

public class funcionario {

	private String nome;
	private double salario;

	public funcionario(String n, double s) 
	{
		this.setNome(n);
		this.setSalario(s);
	}

	public void setNome(String n) {
		nome = n;
	}

	public void setSalario(double sal) {
		salario = sal;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentarSalario() {
		salario = salario + salario * 0.3;
	}

	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}

	public void imprimirInfo() {
		System.out.println(nome + "    " + "Salário: " + this.formatarMoeda());
	}
}
