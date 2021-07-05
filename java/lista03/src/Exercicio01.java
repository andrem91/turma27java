
public class Exercicio01 {

	public static void main(String[] args) {

		final int VALOR_INICIO = 1000, VALOR_FINAL = 1999;
		
		for(int i = VALOR_INICIO; i < VALOR_FINAL; i++) {
			if(i%11 == 5) {
				System.out.println(i);
			}
		}
	}

}
