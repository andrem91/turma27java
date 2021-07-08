package entities;

public class Conta {

	private int numero;
	private String nomeCliente;
	private double saldo;

	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}

	public int getNumero() {
		return numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void credito(double valor) {
		if (valor <= 0) {
			System.out.println("Valor invalido");
		} else {
			saldo += valor;
		}
	}

	public void debito(double valor) {
		if (valor <= 0) {
			System.out.println("Valor invalido");
		} else {
			if (valor <= saldo) {
				saldo -= valor;
			} else {
				System.out.println("Saldo insuficiente.");
			}
		}
	}

}
