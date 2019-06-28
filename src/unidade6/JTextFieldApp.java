package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JTextFieldApp extends JFrame implements ActionListener{

	public static void main(String[] args) {
		JTextFieldApp frame = new JTextFieldApp();
		frame.setTitle("Primeira Aplicação");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		JTextField tf = new JTextField("Digite Aqui");
		tf.addActionListener(frame);
		cont.add(tf, BorderLayout.NORTH);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand().toString());
		
	}

}
