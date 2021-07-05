
public class Exercicio02 {

	public static void main(String[] args) {

		int numeros = 0, impar = 0, par = 0;

		for (int i = 0; i < 10; i++) {
			numeros = (int) (Math.random() * 100) + 1;
			if (numeros % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			System.out.println(numeros);
		}
		System.out.printf("Pares: %d\n", par);
		System.out.printf("Impares: %d\n", impar);
	}

}
