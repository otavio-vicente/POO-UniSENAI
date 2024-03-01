package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.*;
import visualizacao.EntradaSaida;

public class Controladora {
	
	public void exibeMenu() {
		int menu;
		do {
			menu = EntradaSaida.exibeMenu();
			
			switch(menu) {
			case 0:
				CarroPopular carro = new CarroPopular();
				
				String modelo = EntradaSaida.solicitaModelo();
				String cor = EntradaSaida.solicitaCor();
				int ano = EntradaSaida.solicitaAno();
				int qtdeCarros = EntradaSaida.solicitaQtdCarros();
				
				ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();
				for (int i=0; i<qtdeCarros; i++) {
					carro.setModelo(EntradaSaida.solicitaModelo());
					carro.setCor(EntradaSaida.solicitaCor());
					listaDeCarros.add(carro);
				}
				
				break;
			case 1: 
				break;
			case 2:
				break;
			case 3:
				EntradaSaida.exibeMsgEncerraPrograma();
				break;
			}
			
		} while (menu != 3);
		
	}
	
}
