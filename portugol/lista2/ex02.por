programa {
	inclua biblioteca Matematica --> Mat
	
	funcao inicio() {
		cadeia codigo
		inteiro horasTrabalhadas
		const inteiro HORA_MAXIMA = 50
		real salarioTotal, totalExcedente = 0.00
		const real VALOR_HORA_EXCEDENTE = 20.00, VALOR_POR_HORA = 10.00

		escreva("Digite o código do funcionário: ")
		leia(codigo)
		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(horasTrabalhadas)

		se(horasTrabalhadas > HORA_MAXIMA) {
			totalExcedente = (horasTrabalhadas - HORA_MAXIMA) * VALOR_HORA_EXCEDENTE
			salarioTotal = (HORA_MAXIMA * VALOR_POR_HORA) + totalExcedente
		} senao {
			salarioTotal = horasTrabalhadas * VALOR_POR_HORA
		}
			
		escreva("Salário total: R$" + Mat.arredondar(salarioTotal, 2) + "\n")
		escreva("Salário excedente: R$" + Mat.arredondar(totalExcedente, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 643; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */