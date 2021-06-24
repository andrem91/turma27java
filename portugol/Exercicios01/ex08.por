programa {

	inclua biblioteca Matematica
	
	funcao inicio() {

		real percentoDistribuidor = 28.00
		real percentoImpostos = 45.00
		real custoDeFabrica
		real custoAoConsumidor

		escreva("Digite o custo de fábrica do carro")
		leia(custoDeFabrica)

		custoAoConsumidor = ((custoDeFabrica * percentoDistribuidor / 100) + (custoDeFabrica * percentoImpostos / 100) + custoDeFabrica)

		custoAoConsumidor = Matematica.arredondar(custoAoConsumidor, 2)
		
		escreva("O custo ao consumidor do carro é de: R$" + custoAoConsumidor)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 524; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */