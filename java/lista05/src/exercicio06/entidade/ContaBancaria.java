package exercicio06.entidade;

public class ContaBancaria {

	private String numero;
	private String correntista;
	private double saldo;

	public ContaBancaria(String numero, String correntista) {
		this.numero = numero;
		this.correntista = correntista;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		if (valor <= 0 || valor > saldo) {
			System.out.println("Valor invalido.");
		} else {
			saldo -= valor;
		}

	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void mostrarSaldo() {
		System.out.println("Saldo em conta: " + saldo + ".");
	}
}
