import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero = 0, soma = 0, contador = 0;
		double media;
		do {
			System.out.print("Digite um número: ");
			numero = scan.nextInt();
			if(numero%3 == 0) {
				soma+= numero;
				contador++;
			}
		} while(numero != 0);
		media = soma / contador;
		System.out.printf("Média dos números múltiplos de 3: %.2f\n", media);
		scan.close();
	}

}
