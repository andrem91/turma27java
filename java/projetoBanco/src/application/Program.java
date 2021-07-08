package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Conta cli1 = new Conta(34, "Arial");
		
		System.out.println("Cliente: " + cli1.getNomeCliente());
		System.out.println("Saldo atual: R$" + cli1.getSaldo());
		
		cli1.credito(100);
		System.out.println("Saldo atual: R$" + cli1.getSaldo());
		cli1.debito(200);
		System.out.println("Saldo atual: R$" + cli1.getSaldo());
		
		
		scan.close();
	}

}
