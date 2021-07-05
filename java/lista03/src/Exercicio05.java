import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = scan.nextInt();
			soma+=numero;
		} while(numero != 0);
		System.out.printf("Soma: %d\n", soma);
		scan.close();
	}

}
