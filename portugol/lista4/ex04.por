/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
 * em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
 * diagonal, ou seja, diagonal principal.
 */

programa {
	inclua biblioteca Util
	
	funcao inicio() {
		inteiro matriz[3][3], somaMatriz = 0, somaDiagonal = 0

		para(inteiro i = 0; i < 3; i++) {
			para(inteiro j = 0; j < 3; j++) {
				escreva("Valor"+"["+i+"]"+"["+j+"] :")
				leia(matriz[i][j])
				somaMatriz += matriz[i][j]
			}
			somaDiagonal += matriz[i][i]
		}
		limpa()
		para(inteiro i = 0; i < 3; i++) {
			para(inteiro j = 0; j < 3; j++) {
				escreva(matriz[i][j] + "\t")
			}
			escreva("\n")
		}
		escreva("Soma dos valores = " + somaMatriz+"\n")
		escreva("Soma da diagonal = " + somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 681; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */