package ForStudent;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DAO.studentDAO;

public class LoginPanel extends JPanel implements ActionListener{
	
	public static int id;
	private JTextField idText;
	private JTextField nameText;
	private JTextField roomText;
	JButton loginButton = new JButton("Login");
	
	private CardLayout cl;
	private JFrame frame;
	private MainSelect mainSelect;


//	private Image scrennImage;//더플버퍼링 막는
//	private Graphics screenGraphic;//더플버퍼링 막는
	
	public LoginPanel(Object o, CardLayout cl, JFrame frame, MainSelect mainSelect) {
		this.cl = cl;
		this.frame = frame;
		this.mainSelect = mainSelect;
		idText = new JTextField();
		idText.setBounds(242, 101, 214, 27);
		add(idText);
		idText.setColumns(10);
		
		nameText = new JTextField();
		nameText.setBounds(242, 195, 214, 24);
		add(nameText);
		nameText.setColumns(10);
		
		roomText = new JTextField();
		roomText.setBounds(242, 284, 214, 24);
		add(roomText);
		roomText.setColumns(10);
		
		JLabel idLabel = new JLabel("학번 : ");
		idLabel.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		idLabel.setBounds(166, 103, 62, 18);
		add(idLabel);
		
		JLabel nameLabel = new JLabel("이름 :");
		nameLabel.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		nameLabel.setBounds(166, 196, 62, 18);
		add(nameLabel);
		
		JLabel roomLabel = new JLabel("호실 :");
		roomLabel.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		roomLabel.setBounds(166, 285, 62, 18);
		add(roomLabel);
			
		loginButton.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 21));
		loginButton.setBounds(479, 346, 145, 65);
		loginButton.addActionListener(this);
		add(loginButton);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		studentDAO studentDAO = new studentDAO();
		
		if(e.getSource() == loginButton) {
			if(studentDAO.login(idText.getText(), nameText.getText(), roomText.getText())) {
				cl.show(frame.getContentPane(), "mainSelect");
				mainSelect.requestFocus();
			} else {
				
			}
		
		}
	}
}
