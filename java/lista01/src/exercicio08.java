import java.util.Scanner;

/*
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
 * consumidor.
 */
public class exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double percentoDistribuidor = 28.0, percentoImpostos = 45.00, custoDeFabrica = 0, custoAoConsumidor = 0;
		
		System.out.print("Digite o custo de fábrica do carro: R$");
		custoDeFabrica = scan.nextDouble();
		
		custoAoConsumidor = ((custoDeFabrica * percentoDistribuidor / 100) + (custoDeFabrica * percentoImpostos / 100) + custoDeFabrica);
		System.out.println("O custo ao consumidor do carro é de: R$" + String.format("%.2f",custoAoConsumidor));
		
		scan.close();
		
	}

}
