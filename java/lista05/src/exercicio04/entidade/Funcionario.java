package exercicio04.entidade;

public class Funcionario {

	private String nome;
	private String cargo;
	private double salario;

	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void baterPonto() {
		System.out.println("Funcionario bateu ponto....");
	}

	public void receberSalario(double bonus) {
		salario += bonus;
		if (salario > 3000) {
			System.out.println("Funcionário estourou no salário!!!!");
		} else {
			System.out.println("Que mixaria hein!!!");
		}
	}
}
