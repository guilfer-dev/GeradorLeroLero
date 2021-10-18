package aplicacao;

import dados.FraseDois;
import dados.FraseUm;
import modelo.Gerador;

public class Principal {

	public static void main(String[] args) {
		
		Gerador gerador = new Gerador();
		
		System.out.println("Frase gerada:");
		System.out.print(gerador.gerarFrase());

	}

}