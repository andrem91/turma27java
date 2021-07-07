package exercicio01.entidade;

public class Cliente {
	private String nome;
	private int idade;
	private double saldoEmConta;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSaldoEmConta() {
		return saldoEmConta;
	}

	public void setSaldoEmConta(double saldoEmConta) {
		this.saldoEmConta = saldoEmConta;
	}

	public Cliente(String nome, int idade, double saldoEmConta) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.saldoEmConta = saldoEmConta;
	}

	public void passarCartao(double valor) {
		if (valor <= saldoEmConta) {
			saldoEmConta -= valor;
			System.out.println("Debito efetuado.");
		} else {
			System.out.println("Saldo em conta insuficiente. Compra não autorizada.");
		}
	}
}
