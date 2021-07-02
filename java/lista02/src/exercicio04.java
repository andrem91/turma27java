import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double numero;
		
		System.out.print("Digite um número: ");
		numero = scan.nextDouble();
		
		if(numero%2 == 0) {
			System.out.println(numero + " é par.");
			System.out.println("√" + numero + "=" + Math.sqrt(numero));
		} else {
			System.out.println(numero + " é impar.");
			System.out.println(numero + "²=" + Math.pow(numero, 2));
		}
		
		
		scan.close();
	}

}
