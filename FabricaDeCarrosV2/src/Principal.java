//import javax.swing.JOptionPane;

public class Principal {

	private static Carro car = new Carro();
	
	public static void main(String[] args) {

		int modelo, corVeiculo;
		int resultadoModelo, resultadoCor;
			
		//Modelos: Hatch, Sedã, SUV, Esportivo
		//Marca: Chevrolet, Ford, Nissan, Audi
		//Cores: Prata, Preto, Branco, Cinza
		
		modelo = EntradaSaida.solicitaModelo();
		corVeiculo = EntradaSaida.solicitaCor();
		
		resultadoModelo = car.defineModelo(modelo);
		resultadoCor = car.defineCor(corVeiculo);

		
		EntradaSaida.mostraResultado(resultadoModelo, resultadoCor);
		
	}
	
	//Desafio 3.2. Resposta: Para que possam ser chamados sem a necessidade de criar um novo objeto
}
