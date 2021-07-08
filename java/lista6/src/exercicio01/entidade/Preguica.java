package exercicio01.entidade;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	public void emitirSom() {
		System.out.println("Emeitindo som de Preguiça....");
	}

	public void subirEmArvore() {
		System.out.println("Escalando....");
	}
}
