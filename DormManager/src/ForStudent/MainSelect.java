package ForStudent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainSelect extends JPanel{
	JButton stay = new JButton("ÀÜ·ù");
//	JButton loginButton = new JButton("Add");
//	JButton loginButton = new JButton("Add");
	public MainSelect(Object o) {
		stay.addActionListener((ActionListener) o);
		stay.setName("stay");
		stay.setBounds(120, 120, 100, 50);
		stay.addActionListener((ActionListener) o);
		add(stay);
	}
}
