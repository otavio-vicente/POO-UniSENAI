package controle;

import modelo.CarroEsportivo;
import modelo.CarroPopular;
import visualizacao.EntradaSaida;

public class Controladora {
	public void exibeMenu() {
		int modelo, corVeiculo, anoVeiculo, velocidade;
		
		//Modelos: Hatch, Sedã, SUV, Esportivo
		//Marca: Chevrolet, Ford, Nissan, Audi
		//Cores: Prata, Preto, Branco, Cinza
		
		do {
			modelo = EntradaSaida.solicitaModelo();
			corVeiculo = EntradaSaida.solicitaCor();
			anoVeiculo = EntradaSaida.solicitaAno();
			
			if(modelo == 4) {
				velocidade = EntradaSaida.solicitaVelocidade();
				
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
				
		} while (EntradaSaida.saida());
		
	}
}
