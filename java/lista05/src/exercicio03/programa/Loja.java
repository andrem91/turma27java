package exercicio03.programa;

import exercicio03.entidade.ProdutoEletronico;

public class Loja {

	public static void main(String[] args) {

		ProdutoEletronico produto1 = new ProdutoEletronico("Dell", "Notebook", "110v");

		System.out.println(produto1);
		System.out.println("--------------------");
		System.out.println("Está ligado? " + produto1.ligado);
		produto1.ligar();
		System.out.println("Está ligado? " + produto1.ligado);
		produto1.desligar();
		System.out.println("Está ligado? " + produto1.ligado);

	}

}
