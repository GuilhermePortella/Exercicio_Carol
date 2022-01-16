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
	    
	public void velocidade() {

		Double acelerar = getAceleracao();
		Double velocidade = getVelocidadeAtual();

		if (acelerar < 3) {
			System.out.println("É preciso ter no mínimo 3 acelerações");
		} else {
			for (int i = 0; i < acelerar; i++) {
				if (velocidade >= getVelocidadeMaxima()) {
					
					velocidade = (double) getVelocidadeMaxima();
					
					setVelocidadeAtual(velocidade);
					
				} else {
					
					velocidade += getAceleracao();
					
					setVelocidadeAtual(500.0);
					
				}
			}
		}
		
	}
	
	
	public double frear(int velocidadeAtual) {
		int qtdFreio = 0;
		
		if(velocidadeAtual >= getFrenagem()) {
			qtdFreio = (int) (velocidadeAtual / getFrenagem());
		}else {
			velocidadeAtual = 0;
		}
		
		return qtdFreio;
	}
	    
}
