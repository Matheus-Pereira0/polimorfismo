package br.edu.fatecpg.polimorfismo.view;
import br.edu.fatecpg.polimorfismo.model.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("-------------- ATIVIDADE 1 --------------");
		Carro carro = new Carro();
		Bicicleta bicicleta = new Bicicleta();
		
		carro.mover();
		bicicleta.mover();
		
		System.out.println("-------------- ATIVIDADE 2 --------------");
		Calculadora calculadora = new Calculadora();
		
		calculadora.somar(5, 10);
		calculadora.somar(3,4, 5);
		calculadora.somar(4.0, 10.0);
	}
}
