import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int anoIdade, mesesIdade, diasIdade, idadeEmDias;
		
		System.out.println();
		anoIdade = scan.nextInt();
		System.out.println();
		mesesIdade = scan.nextInt();
		System.out.println();
		diasIdade = scan.nextInt();
		
		idadeEmDias = (anoIdade * 365) + (mesesIdade * 12) + diasIdade;
		System.out.println("sua idade em dias é: " + idadeEmDias);
		
		scan.close();
		
	}

}
