programa {
	
	inclua biblioteca Matematica --> Mat
	
	funcao inicio() {
		const real PARTICIPANTES = 20.0
		real salario, somaSalario = 0.00, maiorSalario = 0.00, mediaSalario, mediaFilhos, percentualRecebendoAte100
		inteiro filhos, somaFilhos = 0, pessoasRecebendoAte100 = 0
	
		para(inteiro i = 0; i < PARTICIPANTES ; i++) {
			linha(10)
			escreva("HABITANTE " + (i + 1))
			linha(10)
			escreva("\n")
			escreva("Digite o salário: ")
			leia(salario)
			somaSalario += salario

			escreva("Digite o número de filhos: ")
			leia(filhos)
			somaFilhos += filhos

			se (salario > maiorSalario) {
				maiorSalario = salario
			}
			se (salario <= 100) {
				pessoasRecebendoAte100++
			}
		}

		mediaSalario = somaSalario / PARTICIPANTES
		mediaFilhos = somaFilhos / PARTICIPANTES + 0.0
		percentualRecebendoAte100 = pessoasRecebendoAte100 * PARTICIPANTES + 0.0
		escreva(pessoasRecebendoAte100)
		linha(30)
		escreva("\n")
		escreva("Média do salário da população: R$" + mediaSalario + "\n")
		escreva("Média do número de filhos: " + mediaFilhos + "\n")
		escreva("Maior Salário: R$" + maiorSalario + "\n")
		escreva("percentual de pessoas com salário até R$100,00: " + percentualRecebendoAte100 + "%")
	}

	funcao linha(inteiro quantidade) {
		para (inteiro i = 0; i < quantidade; i++) {
			escreva("-")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 108; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */