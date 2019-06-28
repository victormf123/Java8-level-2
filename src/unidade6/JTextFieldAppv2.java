package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTextFieldAppv2{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Primeira Aplicação");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		JTextField tf = new JTextField("Digite Aqui");
		tf.addActionListener(ev->{
			JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
		});
		
		cont.add(tf, BorderLayout.NORTH);
		frame.setVisible(true);

	}

}
