package ForTeacher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainSelect extends JPanel{
	JButton Add = new JButton("Add");
//	JButton loginButton = new JButton("Add");
//	JButton loginButton = new JButton("Add");
	public MainSelect(Object o) {
		Add.addActionListener((ActionListener) o);
		Add.setName("Add");
		Add.setBounds(120, 120, 100, 50);
		add(Add);
	}
	
}
