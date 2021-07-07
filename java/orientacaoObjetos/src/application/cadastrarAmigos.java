package application;

import java.util.Scanner;

import entities.Pessoa;

public class cadastrarAmigos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Pessoa amigo1 = new Pessoa();
		Pessoa amigo2 = new Pessoa();
		
		System.out.println("AMIGO 1");
		System.out.print("Digite o nome: ");
		amigo1.nome = scan.next();
		System.out.print("Digite o sexo: ");
		amigo1.sexo = scan.next().charAt(0);
		System.out.print("Digite o ano de nascimento: ");
		amigo1.anoDeNascimento = scan.nextInt();
		amigo1.mostrarIdade();
		
		System.out.println("AMIGO 2");
		System.out.print("Digite o nome: ");
		amigo2.nome = scan.next();
		
		scan.close();
	}

}
