package controle;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
import modelo.*;

public class Controladora {
	private Casa casa = null;
	
	public void exibeMenu() {
		int opcao;
		
		do {
			opcao = EntradaSaida.solicitaOpcao();
		
			switch(opcao) {
				case 0:
					this.casa = new Casa();
					
					String descricao = EntradaSaida.solicitaDescricao("casa", 0);
					String cor = EntradaSaida.solicitaCor();
					int qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
					int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");
				
					ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
					
					for (int i=0; i<qtdePortas; i++) {
						Porta porta = new Porta();
						porta.setDescricao(EntradaSaida.solicitaDescricao("porta", (i+1)));
						porta.setEstado(EntradaSaida.solicitaEstado("porta"));
						listaDePortas.add(porta);
					}
					
					ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();
					
					for(int i = 0; i<qtdeJanelas; i++) {
						Janela janela = new Janela();
						janela.setDescricao(EntradaSaida.solicitaDescricao("janela", (i+i)));
						janela.setEstado(EntradaSaida.solicitaEstado("janela"));
						listaDePortas.add(janela);
					}
					
					JOptionPane.showMessageDialog(null, "Construir Casa");
					this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);
					
					System.out.println("Descrição da casa: " + casa.getDescricao()+"\n");
					System.out.println("cor da casa: " + casa.getCor()+"\n");
					
					for(Aberturas porta : casa.getListaDePortas()) {
						System.out.println("Descrição da porta: " + porta.getDescricao()+"\n");
						System.out.println("Estado da porta: " + porta.getEstado()+"\n");
					}
					
					for(Aberturas janela : casa.getListaDeJanelas()) {
						System.out.println("Descrição da janela: " + janela.getDescricao()+"\n");
						System.out.println("Estado da janela: " + janela.getEstado()+"\n");
					}
				break;
				case 1:		
					
					JOptionPane.showMessageDialog(null, "Movimentar portas ou janelas");
				break;
				case 2:
					JOptionPane.showMessageDialog(null, "Ver informações da casa");
				break;
			}
		} while (opcao != 3);
		
		EntradaSaida.exibeMsgEncerraPrograma();
		
		System.exit(0);
		
		
	}
}
