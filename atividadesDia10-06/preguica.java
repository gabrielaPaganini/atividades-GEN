package atividade01;

public class preguica extends animal {

	public preguica() {
		super("pregui�a");
		
	}
	@Override
	public void Nome (String nomeAnimal) {
		System.out.println("\nNome da pregui�a: "+nomeAnimal);
	}
	@Override
	public void Idade(int idadeAnimal) {
		System.out.println("\nIdade do animal: "+idadeAnimal);
	}
	@Override
	public void Som(String somAnimal) {
		System.out.println("\nSom que a pregui�a emite: "+somAnimal);
	}
}
