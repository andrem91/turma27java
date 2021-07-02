/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 * 
 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
 * b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
 */

programa {
	inclua biblioteca Util
	
	funcao inicio() {
		const inteiro LINHA = 4, COLUNA = 6
		inteiro n1[LINHA][COLUNA], n2[LINHA][COLUNA], m1[LINHA][COLUNA], m2[LINHA][COLUNA]

		para(inteiro i = 0; i < LINHA; i++) {
			para(inteiro j = 0; j < COLUNA; j++) {
				n1[i][j] = Util.sorteia(1, 100)
				n2[i][j] = Util.sorteia(1, 100)
				m1[i][j] = n1[i][j] + n2[i][j]
				m2[i][j] = n1[i][j] - n2[i][j]
			}
		}
		escreva("----------------- MATRIZ N1 -----------------\n")
		para(inteiro i = 0; i < LINHA; i++) {
			para(inteiro j = 0; j < COLUNA; j++) {
				escreva(n1[i][j] + "\t")
			}
			escreva("\n")
		}
		escreva("----------------- MATRIZ N2 -----------------\n")
		para(inteiro i = 0; i < LINHA; i++) {
			para(inteiro j = 0; j < COLUNA; j++) {
				escreva(n2[i][j] + "\t")
			}
			escreva("\n")
		}
		escreva("----------------- MATRIZ M1 -----------------\n")
		para(inteiro i = 0; i < LINHA; i++) {
			para(inteiro j = 0; j < COLUNA; j++) {
				escreva(m1[i][j] + "\t")
			}
			escreva("\n")
		}
		escreva("----------------- MATRIZ M2 -----------------\n")
		para(inteiro i = 0; i < LINHA; i++) {
			para(inteiro j = 0; j < COLUNA; j++) {
				escreva(m2[i][j] + "\t")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1496; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */