package unidade6;

import javax.swing.JOptionPane;

public class DialogApp {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Inixiando a Aplicação...", "Instalação Concluida", JOptionPane.INFORMATION_MESSAGE);
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int resposta = JOptionPane.showConfirmDialog(null, "O nome "+ nome +" foi informado. Salvar as alterações?");
		JOptionPane.showMessageDialog(null,""+resposta);
	
	}

}
