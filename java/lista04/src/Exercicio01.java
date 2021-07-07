import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] pontos = new int[5];
		int maior = 0;

		for (int i = 0; i < pontos.length; i++) {
			System.out.print("Didigte o " + (i + 1) + "° ponto: ");
			pontos[i] = scan.nextInt();
			if (pontos[i] > maior) {
				maior = pontos[i];
			}
		}
		System.out.println("Maior pontuação é: " + maior);
		scan.close();
	}

}
