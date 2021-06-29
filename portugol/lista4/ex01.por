/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
 * atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */

programa {
	
	funcao inicio() {
		const inteiro TAMANHO = 5
		inteiro pontuacao[TAMANHO], maior = 0
		para (inteiro i = 0; i < TAMANHO; i++) {
			escreva((i+1) + "ª pontuação: ")
			leia(pontuacao[i])
		}
		escreva("-------------\n")
		para (inteiro i = 0; i < TAMANHO; i++) {
			se(pontuacao[i] > maior) {
				maior = pontuacao[i]
			}
		}
		escreva("A maior pontuação é: " + maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */