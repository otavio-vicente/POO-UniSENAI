import javax.swing.JOptionPane;

public class EntradaSaida {
	
	//Modelos: Hatch, Sedã, SUV, Esportivo
	//Marca: Chevrolet, Ford, Nissan, Audi
	//Cores: Prata, Preto, Branco, Cinza

	public static int solicitaModelo() {
		int modelo = Integer.parseInt(JOptionPane.showInputDialog("Informe o modelo do veículo:\n"
				+ "1- Hatch\n"
				+ "2- Sedã\n"
				+ "3- SUV\n"
				+ "4- Esportivo"));
		while(modelo != 1 && modelo != 2 && modelo != 3 && modelo != 4) {
			modelo = Integer.parseInt(JOptionPane.showInputDialog("Modelo inválido! Informe o modelo do veículo:\n"
				+ "1- Hatch\n"
				+ "2- Sedã\n"
				+ "3- SUV\n"
				+ "4- Esportivo"));
		}
		
		return modelo;
	}
	
	public static int solicitaCor() {
		int cor = Integer.parseInt(JOptionPane.showInputDialog("Informe a cor do veículo:\n"
				+ "1- Prata\n"
				+ "2- Preto\n"
				+ "3- Branco\n"
				+ "4- Cinza"));
		while(cor != 1 && cor != 2 && cor != 3 && cor != 4) {
			cor = Integer.parseInt(JOptionPane.showInputDialog("Cor inválida! Informe a cor do veículo:\n"
				+ "1- Prata\n"
				+ "2- Preto\n"
				+ "3- Branco\n"
				+ "4- Cinza"));
		}
		
		return cor;
	}	
	
	public static void mostraResultado(int resultadoModelo, int resultadoCor) {
		
		String modeloTexto="", corTexto="";
		
		switch(resultadoModelo) {
		case 1:
			modeloTexto = "Hatch";
			break;
		case 2:
			modeloTexto = "Sedã";
			break;
		case 3:
			modeloTexto = "SUV";
			break;
		case 4:
			modeloTexto = "Esportivo";
			break;	
		}
		
		switch(resultadoCor) {
		case 1:
			corTexto = "Prata";
			break;
		case 2:
			corTexto = "Preto";
			break;
		case 3:
			corTexto = "Branco";
			break;
		case 4:
			corTexto = "Cinza";
			break;	
		}
		
		
		JOptionPane.showMessageDialog(null, "Informações do veículo:\n" + "Modelo: " + modeloTexto + ";\n"
				+ "Cor: " + corTexto + ".");
				
	
	}
	
	
}
