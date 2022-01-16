package br.com.carol.entidade;

public class Caminhao extends Veiculo {

	@Override
	public int getCapacidadeMaximaDeCombustivel() {
		// TODO Auto-generated method stub
		return 250;
	}


	@Override
	public int getAutonomia() {
		// TODO Auto-generated method stub
		return 22;
	}
	
	@Override
	public int getVelocidadeMaxima() {
		// TODO Auto-generated method stub
		return 180;
	}
	@Override
	public Double getFrenagem() {
		// TODO Auto-generated method stub
		return Math.pow(getVelocidadeAtual(), 2)/250*0.02;
	}
	
	@Override
	public Double getAceleracao() {
		// TODO Auto-generated method stub
		return 10.0;
	}
}
