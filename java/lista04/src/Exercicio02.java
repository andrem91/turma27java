public class Exercicio02 {

	public static void main(String[] args) {

		int[] lancamentos = new int[10];
		double media = 0, soma = 0;
		;

		for (int i = 0; i < lancamentos.length; i++) {
			lancamentos[i] = (int) (Math.random() * 6 + 1);
			System.out.printf("Lançamento %d : %d\n", i, lancamentos[i]);
			soma += lancamentos[i];
		}
		media = soma / lancamentos.length;

		System.out.printf("Média: %.2f", media);
	}

}
