package br.com.felipe.transporte;
import br.com.felipe.interfaceTransporte.*;

public class Veículo implements Transporte {
	
	private int qtddRodas;
	private boolean motor;
	
	
	public Veículo(int qtddRodas, boolean motor) {
		super();
		this.qtddRodas = qtddRodas;
		this.motor = motor;
	}


	public int getQtddRodas() {
		return qtddRodas;
	}


	public void setQtddRodas(int qtddRodas) {
		this.qtddRodas = qtddRodas;
	}


	public boolean getMotor() {
		return motor;
	}


	public void setMotor(boolean motor, String tipoVeiculo) {
		if(tipoVeiculo == "bicicleta" && motor == true) {
			System.out.println("Esse tipo de veículo não contém motor");
			System.out.println("Selecione motor como false");
		} else{
			this.motor = motor;
		}
		
	}
	
	public void exibirInfo() {
		System.out.println("Quantidade de Rodas: " + qtddRodas);
		System.out.println("Possui Motor? " + motor);
	}


	@Override
	public void mover() {
		
		
	}
	
	
	
}
