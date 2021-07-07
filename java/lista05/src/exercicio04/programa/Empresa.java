package exercicio04.programa;

import java.util.Scanner;

import exercicio04.entidade.Funcionario;

public class Empresa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Funcionario junior = new Funcionario("Jo�ozinho", "Desenvolvedor Java J�nior", 2500.00);
		
		System.out.println("Nome: " + junior.getNome());
		System.out.println("Cargo: " + junior.getCargo());
		System.out.println("Sal�rio: R$" + junior.getSalario());
		
		System.out.print("Valor do bonus: R$");
		junior.receberSalario(scan.nextDouble());
		
		scan.close();
	}

}
