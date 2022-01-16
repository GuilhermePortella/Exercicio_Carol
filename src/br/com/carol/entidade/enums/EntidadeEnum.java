package br.com.carol.entidade.enums;

import br.com.carol.entidade.Caminhao;
import br.com.carol.entidade.Moto;
import br.com.carol.entidade.servico.IVeiculo;
import br.com.carol.entidade.Automovel;

public enum EntidadeEnum {

	AUTOMOVEL1(1, "Carro","Ferrari 812", new Automovel()),
	AUTOMOVEL2(2,"Carro","Bentley Flying Spur", new Automovel()),
	AUTOMOVEL3(3,"Carro","Aston Martin Dbs Superlegera", new Automovel()),
	MOTO1(4, "Moto","Ducati 1198 S", new Moto()),
	MOTO2(5, "Moto","Ducati 620 Sport", new Moto()),
	MOTO3(6, "Moto","Indian Chief Dark Horse", new Moto()),
	CAMINHAO1(7,"Caminhao", "Volvo FH 540", new Caminhao()),
	CAMINHAO2(8, "Caminhao","Scania R450", new Caminhao()),
	CAMINHAO3(9, "Caminhao","Scania R500", new Caminhao());
	

	private int id;
	private String modelo;
	private String tipo;
	private IVeiculo veiculo;

	EntidadeEnum(int id,String tipo, String modelo, IVeiculo veiculo) {
		this.id = id;
		this.tipo = tipo;
		this.modelo = modelo;
		this.veiculo = veiculo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public IVeiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(IVeiculo veiculo) {
		this.veiculo = veiculo;
	}
}


