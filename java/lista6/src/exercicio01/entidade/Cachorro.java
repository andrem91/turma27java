package exercicio01.entidade;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	public void emitirSom() {
		System.out.println("Latindo....");
	}

	public void correr() {
		System.out.println("Correndo....");
	}
}
