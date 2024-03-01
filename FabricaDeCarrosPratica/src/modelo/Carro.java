package modelo;

public abstract class Carro {
	protected String modelo, cor;
	protected int ano;
	
	public String getModelo(){
		return modelo;
	}
	
	public void setModelo() {
		this.modelo = modelo;
	}
	
	public String getCor(){
		return cor;
	}
	
	public void setCor() {
		this.cor = cor;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno() {
		this.ano = ano;
	}
}
