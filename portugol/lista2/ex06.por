programa {
	
	funcao inicio() {
	
		inteiro idade
		cadeia categoria = ""

		escreva("Digite a idade do nadador: ")
		leia(idade)

		
		se (idade >= 5 e idade <= 7) {
			categoria = "Infantil A"
		} senao se (idade >= 8 e idade <= 11) {
			categoria = "Infantil B"
		} senao se (idade == 12 ou idade == 13) {
			categoria = "Juvenil A"
		} senao se (idade >= 14 e idade <= 17) {
			categoria = "Juvenil B"
		} senao se (idade >= 18) {
			categoria = "Adulto"
		}
		escreva("Classificação: " + categoria)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */