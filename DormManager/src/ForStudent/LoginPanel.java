package ForStudent;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DAO.studentDAO;

public class LoginPanel extends JPanel{
	
	public static int id;
	private JTextField idText;
	private JTextField nameText;
	private JTextField roomText;
	JButton loginButton = new JButton("Login");

//	private Image scrennImage;//���ù��۸� ����
//	private Graphics screenGraphic;//���ù��۸� ����
	
	public LoginPanel(Object o) {
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
		
		JLabel idLabel = new JLabel("�й� : ");
		idLabel.setFont(new Font("���Ļ�浸��", Font.PLAIN, 20));
		idLabel.setBounds(166, 103, 62, 18);
		add(idLabel);
		
		JLabel nameLabel = new JLabel("�̸� :");
		nameLabel.setFont(new Font("���Ļ�浸��", Font.PLAIN, 20));
		nameLabel.setBounds(166, 196, 62, 18);
		add(nameLabel);
		
		JLabel roomLabel = new JLabel("ȣ�� :");
		roomLabel.setFont(new Font("���Ļ�浸��", Font.PLAIN, 20));
		roomLabel.setBounds(166, 285, 62, 18);
		add(roomLabel);
			
		loginButton.setFont(new Font("���Ļ�浸��", Font.PLAIN, 21));
		loginButton.setBounds(479, 346, 145, 65);
		add(loginButton);
		
		studentDAO studentDAO = new studentDAO();
		
	}
}
