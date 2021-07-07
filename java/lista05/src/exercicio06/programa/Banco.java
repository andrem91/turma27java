package exercicio06.programa;

import java.util.Scanner;

import exercicio06.entidade.ContaBancaria;

public class Banco {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ContaBancaria conta1 = new ContaBancaria("1234", "Alex");
		
		conta1.mostrarSaldo();
		System.out.print("Depositar: R$");
		conta1.depositar(scan.nextDouble());
		conta1.mostrarSaldo();
		System.out.print("Sacar: R$");
		conta1.sacar(scan.nextDouble());
		conta1.mostrarSaldo();
		
		scan.close();
	}

}
