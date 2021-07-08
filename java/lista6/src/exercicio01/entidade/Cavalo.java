package exercicio01.entidade;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public void emitirSom() {
		System.out.println("Relinchando....");
	}

	public void correr() {
		System.out.println("Correndo....");
	}
}
