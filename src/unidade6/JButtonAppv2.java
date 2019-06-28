package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JButtonAppv2{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Primeira Aplicação");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		JButton botao = new JButton("Isto é um botão");
		botao.addActionListener(ev->{
			JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
		});
		cont.add(botao);
		frame.setVisible(true);

	}

}
