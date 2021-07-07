package entities;

public class Carro {
	
	public String marca;
	public String modelo;
	public int anoDeFabricacao;
	public char combustivel; // A - Alcool, G - Gasolina, F - Flex
	public boolean ligado;
	
	public void ligarCarro() {
		ligado = true;
	}
	public void desligarCarro() {
		ligado = false;
	}
}
