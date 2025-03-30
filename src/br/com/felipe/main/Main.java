package br.com.felipe.main;
import br.com.felipe.transporte.*;

public class Main {
	
	public static void main(String[] args) {
		
		Veículo objCarro = new Carro(4,true,"Uno");
		objCarro.mover();
		objCarro.exibirInfo();
		System.out.println("============================================");
		Veículo objBicicleta = new Bicicleta(2,false,"Monark");
		objBicicleta.mover();
		objBicicleta.exibirInfo();
		System.out.println("============================================");
		Veículo objÔnibus = new Ônibus(4,true,"rota rural");
		objÔnibus.mover();
		objÔnibus.exibirInfo();
		System.out.println("============================================");
		
	}
		
}

