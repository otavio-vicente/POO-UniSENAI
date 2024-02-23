	
public abstract class CarroBase implements IContrato {
	protected int corVeiculo, modelo; 
	protected int anoVeiculo;
	
	public int getCorCarro() {
		return corVeiculo;
	}
	
	public void setCorCarro(int corVeiculo) {
		this.corVeiculo = corVeiculo;
	}
	
	public int getModelo() {
		return modelo;
	}
	
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}	
	
	public int getAno() {
		return anoVeiculo;
	}
	
	public void setAno(int anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}
	
}
