package application;

import java.util.Scanner;

public class ProgramaSemOrientacaoObjetos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] nome = new String[2];
		char[] sexo = new char[2];
		int[] idade = new int[2];
		int dataDeNascimento = 0;
		
		for(int i = 0; i < 0; i++) {
			System.out.print("Digite seu nome: ");
			nome[0] = scan.next();
			System.out.print("Digite seu sexo: ");
			sexo[0] = scan.next().charAt(0);
			System.out.print("Digite seu ano de nascimento: ");
			dataDeNascimento = scan.nextInt();
			idade[0] = 2021 - dataDeNascimento;
			
			if(idade[0] > idade[1]) {
				idade[1] = idade[0];
				sexo[1] = sexo[0];
				nome[1] = nome[0];
			}
			
		}
		
		scan.close();
	}

}
