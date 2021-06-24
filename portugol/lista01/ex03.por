programa {
	
	funcao inicio()
 {
		
		inteiro tempoDoEvento, horas, minutos, segundos

		escreva("Digite os segundos do evento: ")
		leia(tempoDoEvento)

		horas = tempoDoEvento / 3600
		minutos = (tempoDoEvento % 3600) / 60
		segundos = (tempoDoEvento % 3600) % 60

		escreva("Horas: " + horas + "\n")
		escreva("Minutos: " + minutos + "\n")
		escreva("Segundos: " + segundos)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */