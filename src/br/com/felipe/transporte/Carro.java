package br.com.felipe.transporte;


public class Carro extends Veículo  {
	
	private String modeloCarro;
	
	public Carro(int qtddRodas, boolean motor, String modeloCarro) {
		super(qtddRodas, motor);
		this.modeloCarro = modeloCarro;
	}

	
	
	public String getModeloCarro() {
		return modeloCarro;
	}




	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	
	


	@Override
	public void exibirInfo() {
		// TODO Auto-generated method stub
		super.exibirInfo();
		System.out.println("Modelo do Carro: "+ modeloCarro);
	}



	@Override
	public void mover() {
		System.out.println("O " + modeloCarro + " está se movendo pelas estradas");
		
	}
	
}
