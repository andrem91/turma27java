import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Adulto");
		}

		scan.close();
	}

}
