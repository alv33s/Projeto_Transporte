package br.com.felipe.transporte;


public class Ônibus extends Veículo  {
	
	private String rotaOnibus;
		
	public Ônibus(int qtddRodas, boolean motor, String rotaOnibus) {
		super(qtddRodas, motor);
		this.rotaOnibus = rotaOnibus;
	}
	

	public String getRotaOnibus() {
		return rotaOnibus;
	}



	public void setRotaOnibus(String rotaOnibus) {
		this.rotaOnibus = rotaOnibus;
	}

	
	


	@Override
	public void exibirInfo() {
		// TODO Auto-generated method stub
		super.exibirInfo();
		System.out.println("Rota do Ônibus: " + rotaOnibus);
	}


	@Override
	public void mover() {
		System.out.println("O ônibus está se movendo pela " + rotaOnibus );
		
	}
	
	
	
}
