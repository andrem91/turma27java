package entities;

public class Pessoa {

	public String nome;
	public char sexo;
	public int anoDeNascimento;
	
	public void mostrarIdade() {
		System.out.println(2021 - anoDeNascimento);
	}
	
	public int calcularIdade() {
		return 2021 - anoDeNascimento;
	}
}
