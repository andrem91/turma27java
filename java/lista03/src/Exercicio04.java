import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int idade = 0, sexo = 0, caracteristica = 0, count = 0;
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0;
		int pessoasNervosasMais40 = 0, pessoasCalmasMenos18 = 0;

		while (count != 150) {
			System.out.print("Digite sua idade: ");
			idade = scan.nextInt();
			System.out.print("Digite seu sexo(1-feminino/2-masculino/3-Outros): ");
			sexo = scan.nextInt();
			System.out.print("Você é uma pessoa: 1-calma/2-nervosa/3-agressiva: ");
			caracteristica = scan.nextInt();

			if (caracteristica == 1) {
				pessoasCalmas++;
			}
			if (sexo == 1 && caracteristica == 2) {
				mulheresNervosas++;
			}
			if (sexo == 2 && caracteristica == 3) {
				homensAgressivos++;
			}
			if (sexo == 3 && caracteristica == 1) {
				outrosCalmos++;
			}
			if (idade > 40 && caracteristica == 2) {
				pessoasNervosasMais40++;
			}
			if (idade < 18 && caracteristica == 1) {
				pessoasCalmasMenos18++;
			}
			count++;
		}
		System.out.printf("o número de pessoas calmas: %d\n", pessoasCalmas);
		System.out.printf("o número de mulheres nervosas: %d\n", mulheresNervosas);
		System.out.printf("o número de homens agressivos: %d\n", homensAgressivos);
		System.out.printf("o número de outros calmos: %d\n", outrosCalmos);
		System.out.printf("o número de pessoas nervosas com mais de 40 anos: %d\n", pessoasNervosasMais40);
		System.out.printf("o número de pessoas calmas com menos de 18 anos: %d\n", pessoasCalmasMenos18);

		scan.close();

	}

}
