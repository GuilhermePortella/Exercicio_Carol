package br.com.carol.entidade;

public class Moto extends Veiculo{



    @Override
    public String entrada() {
        return null;
    }

    @Override
    public String saida() {
        return null;
    }
	    
	@Override
	public int getCapacidadeMaximaDeCombustivel() {
		
		
		if(getAceleracao() >= 3) {
			int vel1 = (int) (getVelocidadeAtual()/getAceleracao());
		}
		
		return getCapacidadeMaximaDeCombustivel();
	}
	    
}
