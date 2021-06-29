programa
{
	
	funcao inicio()
	{
		cadeia aluno[4]
		inteiro nota[4]
		cadeia nome

		para (inteiro i = 0; i < 4; i++) {
			escreva("----------Aluno " + (i+1) + "----------\n")
			escreva("nome: ")
			leia(aluno[i])
			escreva("Nota: ")
			leia(nota[i])
		}
		escreva("--------------------------\n")
		para(inteiro i = 0; i < 4; i++) {
			escreva("Aluno " + aluno[i] + "\n")
			escreva("Nota " + nota[i] + "\n")
			se(nota[i] < 5) {
				escreva("Ainda não passou. Estude mais!\n")
			} senao {
				escreva("Aprovado! Continue o bom trabalho\n")
			}
			escreva("--------------------------\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */