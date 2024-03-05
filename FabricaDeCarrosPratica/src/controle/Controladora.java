package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.*;
import visualizacao.EntradaSaida;

public class Controladora {
	
	public void exibeMenu() {
		int menu, cont=0;
		
		menu = EntradaSaida.exibeMenu();
		
		int qtdCarros=0;
		
		if(menu == 0) {
			qtdCarros = EntradaSaida.solicitaQtdCarros();
		}
		
		do {
			
			if(cont > 0) {
				menu = EntradaSaida.exibeMenu();
			}
			
			cont++;
			
			Fabrica fabrica = new Fabrica();
			CarroPopular carro = new CarroPopular();
				
			switch(menu) {
			case 0:	

				fabrica.fabricarCarro(carro, qtdCarros);	
				
				break;
			case 1: 
				
				fabrica.venderCarro(carro, qtdCarros);
				
				break;
			case 2:
				
				EntradaSaida.verInformacoes(fabrica.geraInfoCarro(carro, qtdCarros));
				
				
				break;
			case 3:
				EntradaSaida.exibeMsgEncerraPrograma();
				break;
			}
			
		} while (menu != 3);
		
	}
	
}
