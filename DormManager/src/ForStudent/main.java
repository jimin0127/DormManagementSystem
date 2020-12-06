package ForStudent;

import java.awt.CardLayout;

import javax.swing.JFrame;

public class main {
	
	private JFrame frame;
	
	private LoginPanel loginPanel; 			// �����г�
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
		loginPanel = new LoginPanel(this); 
//		gamePanel = new GamePanel(this, frame, cl);
//		gameOverPanel = new GameOverPanel(this);
//		clearPanel = new ClearPanel(this);
//		rankingPanel = new RankingPanel(this);
//		infoPanel = new InfoPanel(this);
//		
//		// ��� �г��� ���̾ƿ��� null�� ��ȯ
		loginPanel.setLayout(null);
//		gamePanel.setLayout(null);
//		gameOverPanel.setLayout(null);
//		clearPanel.setLayout(null);
//		rankingPanel.setLayout(null);
//		infoPanel.setLayout(null);
//		
		// �����ӿ� �гε��� �߰��Ѵ�.(ī�� ���̾ƿ��� ���� �гε�)
		frame.getContentPane().add(loginPanel, "login");
//		frame.getContentPane().add(gamePanel, "game");
//		frame.getContentPane().add(gameOverPanel, "gameover");
//		frame.getContentPane().add(clearPanel, "clear");
//		frame.getContentPane().add(rankingPanel, "ranking");
//		frame.getContentPane().add(infoPanel, "info");
		
		cl.show(frame.getContentPane(), "login"); // start�г��� ī�巹�̾ƿ� �ֻ������ ����
		loginPanel.requestFocus(); // �����ʸ� start�гο� ������ ��
		
		
		frame.setVisible(true); // â ���̰��ϱ�
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
