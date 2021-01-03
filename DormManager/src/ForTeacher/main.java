package ForTeacher;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import DAO.studentDAO;

public class main implements ActionListener{
	
	private JFrame frame;
	
	private AddStudent addStudent; 			// �����г�
	private MainSelect mainSelect;
//	private GamePanel gamePanel; 			// �����г�
//	private GameOverPanel gameOverPanel; 	// ���ӿ����г�
//	private ClearPanel clearPanel; 			// Ŭ�����г�
//	private RankingPanel rankingPanel; 		// ��ŷ �г�
//	private InfoPanel infoPanel;			// ���� �г�
	
	private CardLayout cl; // ī�� ���̾ƿ� - �г� �������� �������� ������ �� �ְ� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
	}
	
	public main() {
		init();
	}
	
	private void init() {
		frame = new JFrame();
		frame.setTitle("����� ���� ���α׷�"); // ���α׷� �̸� ����

		
		cl = new CardLayout();
		frame.getContentPane().setLayout(cl); // �������� ī�巹�̾ƿ����� ����
		
//		// �гο� main�� �ִ� �����ʸ� �־���
		 
		mainSelect = new MainSelect(this);
		addStudent = new AddStudent(this, cl, frame, mainSelect);
//		gamePanel = new GamePanel(this, frame, cl);
//		gameOverPanel = new GameOverPanel(this);
//		clearPanel = new ClearPanel(this);
//		rankingPanel = new RankingPanel(this);
//		infoPanel = new InfoPanel(this);
//		
//		// ��� �г��� ���̾ƿ��� null�� ��ȯ
		addStudent.setLayout(null);
		mainSelect.setLayout(null);
//		gamePanel.setLayout(null);
//		gameOverPanel.setLayout(null);
//		clearPanel.setLayout(null);
//		rankingPanel.setLayout(null);
//		infoPanel.setLayout(null);
//		
		// �����ӿ� �гε��� �߰��Ѵ�.(ī�� ���̾ƿ��� ���� �гε�)
		frame.getContentPane().add(addStudent, "addStudent");
		frame.getContentPane().add(mainSelect, "mainSelect");
//		frame.getContentPane().add(gamePanel, "game");
//		frame.getContentPane().add(gameOverPanel, "gameover");
//		frame.getContentPane().add(clearPanel, "clear");
//		frame.getContentPane().add(rankingPanel, "ranking");
//		frame.getContentPane().add(infoPanel, "info");
		
		cl.show(frame.getContentPane(), "mainSelect"); // start�г��� ī�巹�̾ƿ� �ֻ������ ����
		mainSelect.requestFocus(); // �����ʸ� start�гο� ������ ��
		
		
		frame.setVisible(true); // â ���̰��ϱ�
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == mainSelect.Add) {
			cl.show(frame.getContentPane(), "addStudent"); // ranking�г��� ī�巹�̾ƿ� �ֻ������ ����
			addStudent.requestFocus(); // �����ʸ� ranking�гο� ������ ��
		}
	}
	


}
