import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double d, x1, x2, y1, y2;
		
		System.out.print("Digite o valor de x1: ");
		x1 = in.nextDouble();
		System.out.print("Digite o valor de x2: ");
		x2 = in.nextDouble();
		System.out.print("Digite o valor de y1: ");
		y1 = in.nextDouble();
		System.out.print("Digite o valor de y2: ");
		y2 = in.nextDouble();
		
		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println(String.format("%.2f", d));
		
		in.close();
	}

}
