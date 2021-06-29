/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
 * que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
 * imprima a média aritmética dos lançamentos, contabilize e apresente também
 * quantas foram as ocorrências da maior pontuação.
 */

programa {

	inclua biblioteca Util
	
	funcao inicio() {
		const inteiro LANCAMENTOS = 10
		inteiro valoresDados[LANCAMENTOS]
		real soma = 0.0, media = 0.0

		para(inteiro i = 0; i < LANCAMENTOS; i++) {
			valoresDados[i] = Util.sorteia(1, 6)
			escreva((i+1) + "° Lançamento: " + valoresDados[i]+"\n")
			soma += valoresDados[i]
		}
		escreva("-------------------\n")
		media = soma / LANCAMENTOS
		escreva("Média: " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 672; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */