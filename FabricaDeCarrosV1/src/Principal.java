
public class Principal {
	public static void main(String[] args) {

		int modelo, corVeiculo, marca, ano;
			
		//Modelos: Hatch, Sedã, SUV, Esportivo
		//Marca: Chevrolet, Ford, Nissan, Audi
		//Cores: Prata, Preto, Branco, Cinza
		
		modelo = EntradaSaida.solicitaModelo();
		corVeiculo = EntradaSaida.solicitaCor();
		marca = EntradaSaida.solicitaMarca();
		ano = EntradaSaida.solicitaAno();
		
		EntradaSaida.mostraResultado(modelo, corVeiculo, marca, ano);
		
	}
}
