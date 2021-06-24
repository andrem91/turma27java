programa {
	inclua biblioteca Matematica --> Mat
	
	funcao inicio() {
		real num1
		real num2
		real num3
		real num4

		escreva("Digite 4 números: ")
		leia(num1)
		leia(num2)
		leia(num3)
		leia(num4)

		real quad1 = Mat.potencia(num1, 2.0)
		real quad2 = Mat.potencia(num2, 2.0)
		real quad3 = Mat.potencia(num3, 2.0)
		real quad4 = Mat.potencia(num4, 2.0)

		se(quad3 >= 1000) {
			escreva(quad3)
		} senao {
			escreva(num1 + "² = " + quad1 + "\n")
			escreva(num2 + "² = " + quad2 + "\n")
			escreva(num3 + "² = " + quad3 + "\n")
			escreva(num4 + "² = " + quad4 + "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */