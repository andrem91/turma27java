import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double A, B, C, R, S, D;
		
		System.out.println("Digite o valor de A: ");
		A = scan.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = scan.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = scan.nextDouble();
		
		R = Math.pow((A + B), 2);
		
		S = Math.pow((B + C), 2);
		
		D = (R + S) / 2;
		
		System.out.println(D);
		
		scan.close();
		
	}

}
