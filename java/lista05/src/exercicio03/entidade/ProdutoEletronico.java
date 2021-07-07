package exercicio03.entidade;

public class ProdutoEletronico {

	private String marca;
	private String produto;
	private String voltagem;
	public boolean ligado;

	public ProdutoEletronico(String marca, String produto, String voltagem) {
		this.marca = marca;
		this.produto = produto;
		this.voltagem = voltagem;
	}

	public void ligar() {
		ligado = true;
		System.out.println("Ligando...");
	}

	public void desligar() {
		ligado = false;
		System.out.println("Desligando...");
	}

	public String toString() {
		return "Marca: " + marca + "\nProduto: " + produto + "\nvoltagem: " + voltagem;
	}

}
