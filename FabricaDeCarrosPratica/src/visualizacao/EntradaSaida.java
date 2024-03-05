package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {
	public static int exibeMenu() {
		String[] opcoes = {"Fabricar carros", "Vender um carro", 
				"Ver informações dos carros", "Sair"};
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	
	public static String solicitaModelo() {
		return JOptionPane.showInputDialog("Informe o modelo do carro: ");
	}
	
	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor do carro: ");
	}
	
	public static int solicitaAno() {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro: "));
	}
	
	public static int solicitaQtdCarros() {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros a serem fabricados: "));
	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}
	
	public static void exibeMsgErroBusca() {
		JOptionPane.showMessageDialog(null, "Nenhum carro com os dados informados foi encontrado.");
	}
	
	public static void verInformacoes(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informações dos carros", JOptionPane.INFORMATION_MESSAGE);
	}
}
