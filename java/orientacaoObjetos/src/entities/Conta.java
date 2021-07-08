package entities;

public class Conta {

	private int numero;
	private double saldo;
	private double limite;
	
	public Conta(int numero) {
		this.numero = numero;
	}
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if(valor <= 0) {
			System.out.println("Valor invalido.");
		} else {
			if(valor <= saldo) {
				saldo-=valor;
			} else {
				System.out.println("Saldo insuficiente.");
			}
		}
	}
	
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Valor invalido.");
		} else {
			saldo+=valor;
		}
	}
	
	
}
