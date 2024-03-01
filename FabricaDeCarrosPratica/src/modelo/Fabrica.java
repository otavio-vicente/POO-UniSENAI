package modelo;

import java.util.ArrayList;

public class Fabrica {
	private String modelo;
	private String cor;
	private ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();

	public ArrayList<Carro> getListaDeCarros(){
		return listaDeCarros;
	}
	
	public void setListaDeCarros(ArrayList<Carro> listaDeCarros){
		this.listaDeCarros = listaDeCarros;
	}
	
	
	
	public void fabricarCarro(String modelo, String cor,ArrayList<Carro> listaDeCarros) {
	
	
	}
	
}
