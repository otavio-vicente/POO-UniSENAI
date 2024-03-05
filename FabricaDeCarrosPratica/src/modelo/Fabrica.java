package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import visualizacao.EntradaSaida;

public class Fabrica {
	
	private ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();

	public ArrayList<Carro> getListaDeCarros(){
		return listaDeCarros;
	}
	
	public void setListaDeCarros(ArrayList<Carro> listaDeCarros){
		this.listaDeCarros = listaDeCarros;
	}
	
	
	
	public void fabricarCarro(CarroPopular carro, int qtdCarros) {

		for(int i=0; i<qtdCarros; i++) {
			
			carro.setModelo(EntradaSaida.solicitaModelo());
			carro.setCor(EntradaSaida.solicitaCor());
			carro.setAno(EntradaSaida.solicitaAno());
			listaDeCarros.add(carro);	
		}
		
	}
	
	public void venderCarro(CarroPopular carro, int qtdCarros) {
		int cont=0;
		
		for(int i=0; i<qtdCarros; i++) {
			String modelo = EntradaSaida.solicitaModelo();
			String cor = EntradaSaida.solicitaCor();
			if((carro.getModelo() == modelo) & (carro.getCor() == cor)) {
				listaDeCarros.remove(i);
				cont++;
				System.out.print("Deu bom");
			} 				
		}
		if(cont > 0) {
			EntradaSaida.exibeMsgErroBusca();
		}
	}
	
	public String geraInfoCarro(CarroPopular carro, int qtdCarros) {
		
		String informacoes="";
		
		for(int i=0; i<qtdCarros; i++) {
			informacoes += "Modelo: ";
			informacoes += carro.getModelo();
			informacoes += "\nCor: ";
			informacoes += carro.getCor();
			informacoes += "\nAno: ";
			informacoes += carro.getAno();
			informacoes += "\n";		
		}
		
	return informacoes;	
		
	}
		
}
	

