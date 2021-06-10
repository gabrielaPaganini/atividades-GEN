package atividade01;

public class cachorro extends animal {


	public cachorro()
	{
		super("cachorro");
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
	