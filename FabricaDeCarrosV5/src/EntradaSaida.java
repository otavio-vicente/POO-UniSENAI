import javax.swing.JOptionPane;
import javax.swing.JComboBox;


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
	
	public static int solicitaAno() {
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veículo:\n"));
		while(ano <= 0) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Ano inválido! Informe o ano do veículo:\n"));
		}
		
		return ano;
	}
	
	public static int solicitaVelocidade() {
		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade máxima do veículo:"));
		while(velocidade <= 0) {
			velocidade = Integer.parseInt(JOptionPane.showInputDialog("Resposta inválida! Informe a velocidade máxima do veículo:"));
		}
		return velocidade;
	}
	
	public static void mostraResultado(int modelo, int corVeiculo, int anoVeiculo, int velocidade) {
				
		String modeloTexto="", corTexto="", mensagem;
		int arCondicionado;
		
		switch(modelo) {
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
		
		switch(corVeiculo) {
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
		
		if(velocidade == 0) {
			
			arCondicionado = solicitaArCondicionado();
			String possuiAr;
			
			if(arCondicionado == 1) {
				possuiAr = "Sim.";
			} else {
				possuiAr = "Não.";
			}
			
			mensagem = "Informações do veículo:\n" + "Modelo: " + modeloTexto + ";\n"
					+ "Cor: " + corTexto + "\n"
					+ "Ano do Veículo: " + anoVeiculo + "\n"
					+ "Ar Condicionado: " + possuiAr;
		} else {
			mensagem = "Informações do veículo:\n" + "Modelo: " + modeloTexto + ";\n"
					+ "Cor: " + corTexto + "\n"
					+ "Ano do Veículo: " + anoVeiculo +
					"\nVelocidade Máxima: " + velocidade + ".";
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
						
	
	}
	
	public static int solicitaArCondicionado() {
		
		int arCondicionado = Integer.parseInt(JOptionPane.showInputDialog("O veículo possui ar condicionado?\n"
				+ "1- Sim;\n"
				+ "2- Não."));
		while(arCondicionado != 1 & arCondicionado != 2) {
			arCondicionado = Integer.parseInt(JOptionPane.showInputDialog("Resposta inválida! O veículo possui ar condicionado?\n"
				+ "1- Sim;\n"
				+ "2- Não."));
		}
		
		return arCondicionado;
	}
	
	public static int solicitaOpcao() {
		String[] opcoes = {"Construir Carro", "Listar Carros", 
				"Sair do porgrama"};
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	
	public static boolean saida() {
		
		boolean saida=true;
		
		int sair = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar mais algum carro?\n"
				+ "1- Sim;\n"
				+ "2- Não."));
		while(sair != 1 &
				
				sair != 2) {
			sair = Integer.parseInt(JOptionPane.showInputDialog("Resposta inválida! Deseja cadastrar mais algum carro?\n"
					+ "1- Sim;\n"
					+ "2- Não."));
		}
		
		if(sair == 2) {
			saida = false;
		}
		
		return saida;
	}
	
	
}
