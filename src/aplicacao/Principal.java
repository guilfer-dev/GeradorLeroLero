package aplicacao;

import modelo.Gerador;

public class Principal {

	public static void main(String[] args) {
		
		Gerador gerador = new Gerador();
		
		gerador.gerarFrase();
		
		
		System.out.println("Frase gerada:");
		System.out.print(gerador.gerarFrase());
		
	}

}