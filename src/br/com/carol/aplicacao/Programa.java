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
			System.out.println("Sistema montadora de veiculos");
			System.out.println("______________________________");
			System.out.println();

			System.out.println("              MENU            ");
			System.out.println("______________________________");

			System.out.println();

			for (Integer Key : veiculos.keySet()) {
				System.out.println(Key + ":  " + veiculos.get(Key).getModelo());
			}

			System.out.println("0:  SAIR");

			int veiculo = 0;
			int veiculoCount = 0;
			for (int i = 0; i < 3; i++) {
				veiculoCount++;
				System.out.println();
				System.out.println("______________________________");
				System.out.println();
				System.out.println("Escolha o veiculos no " + veiculoCount + " : ");
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
						System.out.println("Qual dist�ncia a ser percorrida: ");
						System.out.println();
						Double distanciaMeta = console.nextDouble();
						veic.setDistanciaMeta(distanciaMeta);
						System.out.println();
						System.out.println("Qual quantidade de combust�vel: ");
						System.out.println();
						Double qtdeCombustivel = console.nextDouble();
						veic.setConsumoMeta(qtdeCombustivel);
						System.out.println();
						System.out.println("Quantas vezes o acelerador ser� acionado: ");
						System.out.println();
						Integer qtdAcelerador = console.nextInt();
						veic.setAceleradorMeta(qtdAcelerador);
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

				if ("S".equals(opt.toUpperCase()))  {
					System.out.println("Deseja iniciar o teste (S/N)?: ");
					 try {
						 iniciarTestes(veiculosList);
						 
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.getLocalizedMessage());
					} 
					sair = false;
					
					break;
				}
			}

		}
	}

	public static void iniciarTestes(List<Veiculo> veiculos) {

		for (Veiculo veiculo : veiculos) {
						
			veiculo.setVelocidadeAtual(veiculo.getVelocidadeAtual() + veiculo.getAceleracao() * veiculo.getAceleradorMeta());
			
			veiculo.setConsumoAtual(veiculo.getConsumoMeta());
			
			veiculo.setDistanciaPercorrida(veiculo.getDistanciaMeta());
			
			veiculo.saidaTxt();
			
			
		}

	}

}
