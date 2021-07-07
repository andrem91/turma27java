package exercicio01.programa;

import java.util.Scanner;

import exercicio01.entidade.Cliente;

public class Loja {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Cliente c1 = new Cliente(null, 0, 0);
		
		System.out.print("Informe seu nome: ");
		c1.setNome(scan.next());
		System.out.print("Informe sua idade: ");
		c1.setIdade(scan.nextInt());
		System.out.print("Informe seu saldo em conta: ");
		c1.setSaldoEmConta(scan.nextDouble());
		
		System.out.print("Qual o valor da compra?");
		c1.passarCartao(scan.nextDouble());
		
		scan.close();

	}

}
