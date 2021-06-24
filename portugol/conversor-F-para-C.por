programa {
	funcao inicio() {
		cadeia nome
		real F
		real C

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Temperatura em F: ")
		leia(F)
		C = (F -32) / 1.8
		escreva("Olá " + nome + ", a temperatura em C :" + C)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */