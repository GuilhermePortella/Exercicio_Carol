package br.com.carol.entidade;

public class Automovel extends Veiculo{

	@Override
	public int getCapacidadeMaximaDeCombustivel() {
		// TODO Auto-generated method stub
		return 75;
	}
	
	@Override
	public int getAutonomia() {
		// TODO Auto-generated method stub
		return 8;
	}
	
	@Override
	public int getVelocidadeMaxima() {
		// TODO Auto-generated method stub
		return 290;
	}
	@Override
	public Double getFrenagem() {
		// TODO Auto-generated method stub
		return Math.pow(getVelocidadeAtual(), 2)/250*0.10;
	}
	
	@Override
	public Double getAceleracao() {
		// TODO Auto-generated method stub
		return 15.0;
	}
	
	

}