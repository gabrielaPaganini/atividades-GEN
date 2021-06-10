package atividade01;

public class cavalo extends animal {
	
	public cavalo() {
		super("cavalo");
	}
	@Override
	public void Nome (String nomeAnimal) {
		System.out.println("\nNome do cachorro: "+nomeAnimal);
	}
	@Override
	public void Idade(int idadeAnimal) {
		System.out.println("\nIdade do animal: "+idadeAnimal);
	}
	@Override
	public void Som(String somAnimal) {
		System.out.println("\nSom que o cachorro emite: "+somAnimal);
	}
}

