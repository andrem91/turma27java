programa {
	
	funcao inicio() {
		inteiro numero = 0, soma = 0, contador = 0
		real media = 0.0

		enquanto(numero >= 0) {

			escreva("Digite num número: ")
			leia(numero)
			se(numero >= 0) {
				soma+=numero
				contador++
			}
		}
		
		media = soma / contador + 0.0
		escreva("Soma = " + soma + "\n")
		escreva("Média = " + media + "\n")
		escreva("Total de valores lidos = " + contador)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */