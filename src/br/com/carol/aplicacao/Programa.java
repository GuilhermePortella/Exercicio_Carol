package br.com.carol.aplicacao;


import br.com.carol.entidade.Veiculo;
import br.com.carol.entidade.enums.EntidadeEnum;

import java.util.*;



public  class Programa{
	

	
	public static void main(String[] args) {
		
		Map<Integer, EntidadeEnum> veiculos = new HashMap<>();
		Scanner console = new Scanner(System.in);
        Scanner consoleFinal = new Scanner(System.in);
		List<Veiculo> veiculosList = new ArrayList<>();

		for (EntidadeEnum entidadeEnum : EntidadeEnum.values()) {
			veiculos.put(entidadeEnum.getId(),entidadeEnum);
		}
        boolean sair =false;

		while(sair==false) {
            System.out.println("Sistema montadora de ve�culos");
            System.out.println("______________________________");
            System.out.println();

            System.out.println("              MENU            ");
            System.out.println("______________________________");

            //Ve�culos a serem constru�dos e testados:
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
                System.out.println("Escolha o ve�culo n� "+  veiculoCount+" : ");
                veiculo = console.nextInt();
                if(veiculo==0){
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
                        veic.getAceleradorMeta(qtdAcelerador);
                        veic.saidaTxt();
                        veic.setVelocidadeAtual(67.0);
                        veiculosList.add(veic);

                    }

                }
            }

            if(sair==false) {
                System.out.println("______________________________");
                System.out.println();
                System.out.println("Deseja iniciar o teste (S/N)?: ");
                System.out.println();
                String opt = consoleFinal.nextLine();

                if ("S".equals(opt.toUpperCase())) {
                    System.out.println("Deseja iniciar o teste (S/N)?: ");
                    iniciarTestes(veiculosList);
                    sair=false;
                    break;
                }
            }

        }
	}


	public static void iniciarTestes(List<Veiculo> veiculos){


	   for(Veiculo veiculo: veiculos){
		   
		   
		  veiculo.getCapacidadeMaximaDeCombustivel();
		  veiculo.getVelocidadeAtual();
		  veiculo.getDistanciaPercorrida();
		  veiculo.getConsumoAtual();
		  veiculo.getFrenagem();
		  
		  
		  veiculo.setCapacidadeMaximaDeCombustivel((int) (veiculo.getDistanciaPercorrida()/veiculo.getConsumoAtual()));
		  
		  veiculo.setAutonomia((int) (veiculo.getDistanciaPercorrida()/veiculo.getCapacidadeMaximaDeCombustivel()));

		  if(veiculo.getDistanciaMeta()/veiculo.getAceleracao() > 0) {
			  
			  veiculo.setCapacidadeMaximaDeCombustivel(veiculo.getAceleracao());
			  
		  }else {
			  
		  }
		  
		   
	       // A acelera��o aumentando respeitando o par�metro de acr�scimo sem ultrapassar a velocidade m�xima;

           //dist�ncia percorrida aumentando sem ultrapassar a dist�ncia m�xima a ser percorrida utilizando-se a quantidade de combust�vel informada;

           //quantidade de combust�vel diminuindo conforme a dist�ncia percorrida for aumentando at� que o tanque se esvazie (n�o devem ser exibidos valores negativos);

           //�ndice de frenagem aumentado obedecendo o par�metro de frenagem para o ve�culo (n�o devem ser exibidos valores negativos).


           //Exibir relatorio final
           veiculo.saidaTxt();

       }



    }
	
}