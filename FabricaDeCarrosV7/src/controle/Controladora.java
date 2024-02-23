package controle;

import javax.swing.JOptionPane;

import modelo.CarroEsportivo;
import modelo.CarroPopular;
import visualizacao.EntradaSaida;

public class Controladora {
	public void exibeMenu() {
		int modelo=0, corVeiculo=0, anoVeiculo=0, velocidade=0, opcao, cont=0;
		
		//Modelos: Hatch, Sedã, SUV, Esportivo
		//Marca: Chevrolet, Ford, Nissan, Audi
		//Cores: Prata, Preto, Branco, Cinza
		
		do {
			opcao = EntradaSaida.solicitaOpcao();
			
			switch(opcao) {
			case 0:
				cont++;
				modelo = EntradaSaida.solicitaModelo();
				corVeiculo = EntradaSaida.solicitaCor();
				anoVeiculo = EntradaSaida.solicitaAno();
				if(modelo == 4) {
					velocidade = EntradaSaida.solicitaVelocidade();
				}
			break;
			case 1:
				if(cont == 0) {
					JOptionPane.showMessageDialog(null, "Não existe registro de carros...");
				} else {
					if(modelo == 4) {
						
						CarroEsportivo carroEsportivo = new CarroEsportivo();
						carroEsportivo.setModelo(modelo);
						carroEsportivo.setCorCarro(corVeiculo);
						carroEsportivo.setAno(anoVeiculo);
						carroEsportivo.setVelocidade(velocidade);
						
						EntradaSaida.mostraResultado(carroEsportivo.getModelo(), carroEsportivo.getCorCarro(), carroEsportivo.getAno(), carroEsportivo.getVelocidade());
					} else {
						CarroPopular carroPopular= new CarroPopular();
						carroPopular.setModelo(modelo);
						carroPopular.setCorCarro(corVeiculo);
						carroPopular.setAno(anoVeiculo);
						
						EntradaSaida.mostraResultado(carroPopular.getModelo(), carroPopular.getCorCarro(), carroPopular.getAno(), 0);
	
					}
				}
			break;
			
			default: 
			break;
				
			}	
			
		} while (opcao == 1 || opcao == 0);
		
	}
}
 
