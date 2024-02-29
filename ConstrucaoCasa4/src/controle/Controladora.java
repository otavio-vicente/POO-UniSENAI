package controle;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
import modelo.*;

public class Controladora {
	private Casa casa = null;
	
	public void exibeMenu() {
		int opcao, cont=0;
		
		do {
			opcao = EntradaSaida.solicitaOpcao();
		
			switch(opcao) {
				case 0:
					cont++;
					this.casa = new Casa();
					
					String descricao = EntradaSaida.solicitaDescricao("casa", 0);
					String cor = EntradaSaida.solicitaCor();
					int qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
					while(qtdePortas <= 0) {
						if(qtdePortas <= 0) {
							JOptionPane.showMessageDialog(null, "A quantidade de portas não pode ser menor ou igual a zero.");
							qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
						}
					}
					int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");
					while(qtdeJanelas <= 0) {
						if(qtdeJanelas <= 0) {
							JOptionPane.showMessageDialog(null, "A quantidade de portas não pode ser menor ou igual a zero.");
							qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");
						}
					}
				
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
						listaDeJanelas.add(janela);
					}
					
					//JOptionPane.showMessageDialog(null, "Construir Casa");
					this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);
					
					System.out.println("Descrição da casa: " + casa.getDescricao()+"\n");
					System.out.println("Cor da casa: " + casa.getCor()+"\n");
					
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
					if(cont > 0) {
						String tipoAbertura = EntradaSaida.solicitaTipoAbertura();
						
						ArrayList<Aberturas> listaDeAberturas = new ArrayList<Aberturas>();
						
						if(tipoAbertura.equals("porta")) {
							listaDeAberturas = this.casa.getListaDePortas();
						} else {
							listaDeAberturas = this.casa.getListaDeJanelas();
						}
						
						int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas);
						int novoEstado = 0;
						
						if(posicao != -1) {
							novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);
							Aberturas abertura = this.casa.retornaAbertura(posicao, tipoAbertura);
							this.casa.moverAbertura(abertura, novoEstado);
							System.out.println("Novo estado da " + tipoAbertura + ": " + abertura.getEstado());
						} else {
							EntradaSaida.exibeMsgEncerraPrograma();
						}
					} else {
						JOptionPane.showMessageDialog(null, "Nenhuma casa foi construída. Primeiro faça a criação para poder movimentar as aberturas...");
					}
					
					//JOptionPane.showMessageDialog(null, "Movimentar portas ou janelas");
				break;
				case 2:
					if(cont > 0) {
						String informacoes = this.casa.geraInfoCasa();
						EntradaSaida.exibeInfoCasa(informacoes);
					} else {
						JOptionPane.showMessageDialog(null, "Nenhuma casa foi construída. Primeiro faça a criação para poder visualizar as informações...");
					}
					//JOptionPane.showMessageDialog(null, "Ver informações da casa");
				break;
			}
		} while (opcao != 3);
		
		EntradaSaida.exibeMsgEncerraPrograma();
		
		System.exit(0);
		
		
	}
}
