import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int idade = 0, menosDe21 = 0, maisDe50 = 0;
		
		while(idade != -99) {
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			
			if(idade < 21 && idade > 0) {
				menosDe21++;
			} else if(idade > 50) {
				maisDe50++;
			}
		}
		System.out.printf("Pessoas com menos de 21 anos: %d\n", menosDe21);
		System.out.printf("Pessoas com mais de 50 anos: %d\n", maisDe50);
		
		scan.close();
		
	}

}
