package br.com.carol.aplicacao;

import br.com.carol.entidade.Moto;
import br.com.carol.entidade.Veiculo;
import br.com.carol.entidade.enums.EntidadeEnum;

import java.util.*;

public class Programa {

	public static void main(String[] args) {

		Map<Integer, EntidadeEnum> veiculos = new HashMap<>();
		Scanner console = new Scanner(System.in);
		Scanner consoleFinal = new Scanner(System.in);
		List<Veiculo> veiculosList = new ArrayList<>();

		for (EntidadeEnum entidadeEnum : EntidadeEnum.values()) {
			veiculos.put(entidadeEnum.getId(), entidadeEnum);
		}
		boolean sair = false;

		while (sair == false) {
			System.out.println("Sistema montadora de veï¿½culos");
			System.out.println("______________________________");
			System.out.println();

			System.out.println("              MENU            ");
			System.out.println("______________________________");

			// Veï¿½culos a serem construï¿½dos e testados:
			System.out.println();

			for (Integer Key : veiculos.keySet()) {
				System.out.println(Key + ":  " + veiculos.get(Key).getModelo());
			}

			System.out.println("0:  SAIR");

			int veiculo = 0;
			int veiculoCount = 0;
			for (int i = 0; i < 1; i++) {
				veiculoCount++;
				System.out.println();
				System.out.println("______________________________");
				System.out.println();
				System.out.println("Escolha o veï¿½culo nï¿½ " + veiculoCount + " : ");
				veiculo = console.nextInt();
				if (veiculo == 0) {
					sair = true;
					break;
				}
				for (Integer key : veiculos.keySet()) {
					if (key.equals(veiculo)) {
						Veiculo veic = (Veiculo) veiculos.get(key).getVeiculo();
						veic.setModelo(veiculos.get(key).getModelo());
						veic.setTipo(veiculos.get(key).getTipo());
						System.out.println();
						System.out.println("Qual distï¿½ncia a ser percorrida: ");
						System.out.println();
						Double distanciaMeta = console.nextDouble();
						veic.setDistanciaMeta(distanciaMeta);
						System.out.println();
						System.out.println("Qual quantidade de combustï¿½vel: ");
						System.out.println();
						Double qtdeCombustivel = console.nextDouble();
						veic.setConsumoMeta(qtdeCombustivel);
						System.out.println();
						System.out.println("Quantas vezes o acelerador serï¿½ acionado: ");
						System.out.println();
						Integer qtdAcelerador = console.nextInt();
						veic.getAceleradorMeta(qtdAcelerador);
						veic.saidaTxt();
						veic.setVelocidadeAtual(67.0);
						veiculosList.add(veic);

					}

				}
			}

			if (sair == false) {
				System.out.println("______________________________");
				System.out.println();
				System.out.println("Deseja iniciar o teste (S/N)?: ");
				System.out.println();
				String opt = consoleFinal.nextLine();

				if ("S".equals(opt.toUpperCase())) {
					System.out.println("Deseja iniciar o teste (S/N)?: ");
					iniciarTestes(veiculosList);
					sair = false;
					break;
				}
			}

		}
	}

	public static void iniciarTestes(List<Veiculo> veiculos) {

		String M = "Moto";
		String C = "Caminhao";
		String A = "Carro";
		System.out.println(veiculos.size());
		for (Veiculo veiculo : veiculos) {
			
			// Distancia percorrida
			if (veiculo.tipo == C) {

				veiculo.setDistanciaPercorrida(10.0);

			} else if (veiculo.tipo == M) {
				veiculo.setDistanciaPercorrida(20.0);

			} else {
				veiculo.setDistanciaPercorrida(15.0);
			}
			
			//Consumo de Combustível
			
				if (veiculo.tipo == C) {// 10
					
					veiculo.setConsumoAtual(veiculo.getCapacidadeMaximaDeCombustivel() - veiculo.getDistanciaPercorrida());
			
				} else if (veiculo.tipo == M) {// 20
					veiculo.setConsumoAtual(veiculo.getCapacidadeMaximaDeCombustivel() - veiculo.getDistanciaPercorrida());
					
				} else {// 15
					veiculo.setConsumoAtual(veiculo.getCapacidadeMaximaDeCombustivel() - veiculo.getDistanciaPercorrida());
				}
			

			// A aceleraï¿½ï¿½o aumentando respeitando o parï¿½metro de acrï¿½scimo sem
			// ultrapassar a velocidade mï¿½xima;

			// distï¿½ncia percorrida aumentando sem ultrapassar a distï¿½ncia mï¿½xima a
			// ser percorrida utilizando-se a quantidade de combustï¿½vel informada;
			
			
			//Capacidade Máxima de Combustível
			if (veiculo.tipo == C) {
				veiculo.setCapacidadeMaximaDeCombustivel(250);

			} else if (veiculo.tipo == M) {
				veiculo.setCapacidadeMaximaDeCombustivel(25);

			} else {
				veiculo.setCapacidadeMaximaDeCombustivel(75);
			}

			
			//Frenagem
			if (veiculo.tipo == C) {
				veiculo.setFrenagem(veiculo.getVelocidadeAtual() / 2);

			} else if (veiculo.tipo == M) {
				veiculo.setFrenagem(veiculo.getVelocidadeAtual() / 10);

			} else {
				veiculo.setFrenagem(veiculo.getVelocidadeAtual() / 10);
			}
			veiculo.saidaTxt();

		}

	}

}