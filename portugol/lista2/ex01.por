programa {
	inclua biblioteca Matematica --> Mat
	
	funcao inicio() {
		
		inteiro pesoMaximo = 50
		real valorMulta = 4.00
		real multa = 0.0
		inteiro peso = 0
		

		escreva("Digite o peso de domate: ")
		leia(peso)
		
		
		se (peso > pesoMaximo) {
			escreva("Houve excesso de peso!\n")
			multa = valorMulta * (peso - pesoMaximo)
		}

		escreva("Multa: R$"+Mat.arredondar(multa, 2))
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */