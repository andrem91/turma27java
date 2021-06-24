programa {
	funcao inicio(){
		inteiro anoIdade, mesesIdade, diasIdade, idadeEmDias

		escreva("Digite quantos anos você tem ")
		leia(anoIdade)
		escreva("Digite a quantidade de meses: ")
		leia(mesesIdade)
		escreva("Digite a quantidade de dias: ")
		leia(diasIdade)

		idadeEmDias = (anoIdade * 365) + (mesesIdade * 12) + diasIdade
		 
		
		
		escreva("sua idade em dias é: " + idadeEmDias)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */