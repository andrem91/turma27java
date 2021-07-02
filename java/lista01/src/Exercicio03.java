import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tempoDoEvento, horas, minutos, segundos;
		
		System.out.print("Digite os segundos do evento: ");
		tempoDoEvento = scan.nextInt();
		
		horas = tempoDoEvento / 3600;
		minutos = (tempoDoEvento % 3600) / 60;
		segundos = (tempoDoEvento % 3600) % 60;
		
		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);
		
		scan.close();
	}
}
