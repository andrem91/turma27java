import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3, maiorNumero;
		
		System.out.println("Digite 3 números inteiros: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			maiorNumero = num1;
		} else if(num2 >= num3) {
			maiorNumero = num2;
		} else {
			maiorNumero = num3;
		}
		
		System.out.println("O maior número é " + maiorNumero);
		
		scan.close();
	}

}
