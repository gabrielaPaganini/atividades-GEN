package atividade01;

public abstract class animal {
	
	private String tipoAnimal;
	
	abstract public void Nome(String nomeAnimal);
	abstract public void Idade(int idadeAnimal);
	abstract public void Som(String somAnimal);
	
	public animal (String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
}