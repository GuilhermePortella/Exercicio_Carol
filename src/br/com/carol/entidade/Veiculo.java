package br.com.carol.entidade;


import br.com.carol.entidade.servico.IVeiculo;

public abstract class Veiculo implements IVeiculo {

	public String tipo;
	public String modelo;
	public Double aceleracao=0.0;
 	protected Integer autonomia;
	protected Double frenagem =0.0;
	protected Double distanciaPercorrida =0.0;
	protected Double distanciaMeta =0.0;
	protected Double consumoAtual =0.0;
	protected Double consumoMeta =0.0;
	protected Integer aceleradorMeta =0;
	protected Double velocidadeAtual=0.0;
	protected Integer velocidadeMaxima=0;
	protected Integer capacidadeMaximaDeCombustivel=0;



	public void saidaTxt(){

		System.out.println("______________________________");
		System.out.println();
		System.out.println("Tipo de Veículo.: "+ tipo);
		System.out.println("Modelo.: "+ modelo);
		System.out.println("Capacidade Máxima de Combustível.:" + capacidadeMaximaDeCombustivel);
		if(velocidadeAtual>0) {
			System.out.println("Velocidade Final Alcançada.:" + velocidadeAtual);
		}else {
			System.out.println("Velocidade Atual.:" + velocidadeAtual);
		}
		System.out.println("Distância percorrida.:" + distanciaPercorrida);
		System.out.println("Consumo de Combustível.:"+ consumoAtual);
		System.out.println("Frenagem.:"+ frenagem);

 	}


	public void setAutonomia(Integer autonomia) {
		this.autonomia = autonomia;
	}

	public Double getFrenagem() {
		return frenagem;
	}

	public void setFrenagem(Double frenagem) {
		this.frenagem = frenagem;
	}

	public Double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(Double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

	public Double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(Double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void setVelocidadeMaxima(Integer velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void setCapacidadeMaximaDeCombustivel(Integer capacidadeMaximaDeCombustivel) {
		this.capacidadeMaximaDeCombustivel = capacidadeMaximaDeCombustivel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(Double aceleracao) {
		this.aceleracao = aceleracao;
	}


	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getCapacidadeMaximaDeCombustivel() {
		return capacidadeMaximaDeCombustivel;
	}

	public void setCapacidadeMaximaDeCombustivel(int capacidadeMaximaDeCombustivel) {
		this.capacidadeMaximaDeCombustivel = capacidadeMaximaDeCombustivel;
	}

	public Double getDistanciaMeta() {
		return distanciaMeta;
	}

	public void setDistanciaMeta(Double distanciaMeta) {
		this.distanciaMeta = distanciaMeta;
	}

	public Double getConsumoAtual() {
		return consumoAtual;
	}

	public void setConsumoAtual(Double consumoAtual) {
		this.consumoAtual = consumoAtual;
	}

	public Double getConsumoMeta() {
		return consumoMeta;
	}

	public void setConsumoMeta(Double consumoMeta) {
		this.consumoMeta = consumoMeta;
	}

	public Integer getAceleradorMeta(Integer qtdAcelerador) {
		return aceleradorMeta;
	}

	public void setAceleradorMeta(Integer aceleradorMeta) {
		this.aceleradorMeta = aceleradorMeta;
	}
}


