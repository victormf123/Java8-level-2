package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Primeira Aplicação");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		JTextArea tf = new JTextArea("Digite Aqui");
		cont.add(tf, BorderLayout.NORTH);
		frame.setVisible(true);

	}

}
