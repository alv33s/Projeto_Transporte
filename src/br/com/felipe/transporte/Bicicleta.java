package br.com.felipe.transporte;


public class Bicicleta extends Veículo {
	
	private String marcaBicicleta;
	
	public Bicicleta(int qtddRodas, boolean motor, String marcaBicicleta) {
		super(qtddRodas, motor);
		this.marcaBicicleta = marcaBicicleta;
	}

	
	
	public String getMarcaBicicleta() {
		return marcaBicicleta;
	}




	public void setMarcaBicicleta(String marcaBicicleta) {
		this.marcaBicicleta = marcaBicicleta;
	}

	


	@Override
	public void exibirInfo() {
		// TODO Auto-generated method stub
		super.exibirInfo();
		System.out.println("Marca da Bicicleta: " + marcaBicicleta);
	}



	@Override
	public void mover() {
		System.out.println("A " + marcaBicicleta + " está sendo pedalada");
		
	}
	
	
	
}
