package exercicio01.aplicacao;

import exercicio01.entidade.Cachorro;
import exercicio01.entidade.Cavalo;
import exercicio01.entidade.Preguica;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("------CACHORRO------");
		Cachorro cachorro = new Cachorro("Toby", 5);
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade());
		cachorro.correr();
		cachorro.emitirSom();
		
		
		System.out.println("------CAVALO------");
		Cavalo cavalo = new Cavalo("Spirit", 12);
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		cavalo.correr();
		cavalo.emitirSom();
		
		System.out.println("------PREGUIÇA------");
		Preguica preguica = new Preguica("Armandinho", 20);
		System.out.println("Nome: " + preguica.getNome());
		System.out.println("Idade" + preguica.getIdade());
		preguica.emitirSom();
		preguica.subirEmArvore();
		
		
	}

}
