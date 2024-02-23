//import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {

		int modelo, corVeiculo;
			
		//Modelos: Hatch, Sedã, SUV, Esportivo
		//Marca: Chevrolet, Ford, Nissan, Audi
		//Cores: Prata, Preto, Branco, Cinza
		
		modelo = EntradaSaida.solicitaModelo();
		corVeiculo = EntradaSaida.solicitaCor();
		
		Carro modeloDoCarro = new Carro();
		modeloDoCarro.setModelo(modelo);
		
		Carro corDoCarro = new Carro();
		corDoCarro.setCorCarro(corVeiculo);
		
		//resultadoModelo = setModelo.defineModelo(modelo);
		//resultadoCor = car.defineCor(corVeiculo);

		
		EntradaSaida.mostraResultado(modeloDoCarro.getModelo(), corDoCarro.getCorCarro());
		
	}
	
	//Desafio 3.2. Resposta: Para que possam ser chamados sem a necessidade de criar um novo objeto
}
