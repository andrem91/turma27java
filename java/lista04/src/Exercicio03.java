
public class Exercicio03 {

	public static void main(String[] args) {
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];

		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				n1[i][j] = (int) (Math.random() * 100);
				n2[i][j] = (int) (Math.random() * 100);
				m1[i][j] = n1[i][j] + n2[i][j];
				m2[i][j] = n1[i][j] - n2[i][j];
			}
		}

		System.out.println("----------------- MATRIZ N1 -----------------");
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("----------------- MATRIZ N2 -----------------");
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("----------------- MATRIZ M1 -----------------");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("----------------- MATRIZ M2 -----------------");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				System.out.print(m2[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
