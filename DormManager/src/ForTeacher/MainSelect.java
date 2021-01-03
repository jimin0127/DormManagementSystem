package ForTeacher;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DAO.studentDAO;

public class MainSelect extends JPanel{
	private JTable table;
	JButton Add = new JButton("Add");
	
//	JButton loginButton = new JButton("Add");
//	JButton loginButton = new JButton("Add");
	public MainSelect(Object o) {
		studentDAO dao = new studentDAO();
		
		table = new JTable();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(69, 70, 200, 200);
		
		dao.ShowTable(table);
		//table.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		scrollPane.setViewportView(table);
		add(scrollPane);
		
		
		
		Add.addActionListener((ActionListener) o);
		Add.setName("Add");
		Add.setBounds(300, 200, 100, 50);
		add(Add);
	}
	
}
