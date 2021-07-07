import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] mat = new int[3][3];
		int somaMat = 0, somaDiagonal =0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.print("Digite um número: ");
				mat[i][j] = scan.nextInt();
				somaMat += mat[i][j];
			}
			somaDiagonal+=mat[i][i];
		}
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.printf("Soma da matriz: %d\n", somaMat);
		System.out.printf("Soma da diagonal: %d\n", somaDiagonal);
		
		scan.close();
	}

}
