programa {
	funcao inicio() {
		
		inteiro numero
		inteiro soma = 0

		escreva("Digite um número: ")
		leia(numero)
		escreva("Números divisiveis: ")
		para(inteiro i = 1; i < numero; i++) {
			se(numero%i == 0) {
				soma += i
				escreva(i + " ")
			}
		}
		se(soma == numero) {
			escreva("\nSoma dos número divisiveis é: " + soma + ": Número perfeito")
			
		} senao {
			escreva("\nSoma dos número divisiveis é: " + soma + ": Número não é perfeito")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */