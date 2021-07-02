import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Nota 1: ");
		nota1 = scan.nextDouble();
		nota1 *= 2;
		System.out.println("Nota 2: ");
		nota2 = scan.nextDouble();
		nota2 *= 3;
		System.out.println("Nota 3: ");
		nota3 = scan.nextDouble();
		nota3 *= 5;
		
		media = (nota1 + nota2 + nota3) / 10;
		
		System.out.println("Média: " + String.format("%.2f", media));
		
		scan.close();

	}

}
