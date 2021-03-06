package ForStudent;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class main implements ActionListener{
	
	JFrame frame;
	
	private LoginPanel loginPanel; 			// 시작패널
	MainSelect mainSelect;
	private StayPanel stayPanel;
//	private GameOverPanel gameOverPanel; 	// 게임오버패널
//	private ClearPanel clearPanel; 			// 클리어패널
//	private RankingPanel rankingPanel; 		// 랭킹 패널
//	private InfoPanel infoPanel;			// 설명 패널
	
	CardLayout cl; // 카드 레이아웃 - 패널 여러개를 돌려가며 보여줄 수 있게 해줌

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
	}
	
	public main() {
		init();
	}
	
	private void init() {
		frame = new JFrame();
		frame.setTitle("기숙사 관리 프로그램"); // 프로그램 이름 지정

		
		cl = new CardLayout();
		frame.getContentPane().setLayout(cl); // 프레임을 카드레이아웃으로 변경
		
//		// 패널에 main에 있는 리스너를 넣어줌
		mainSelect = new MainSelect(this);
		stayPanel = new StayPanel(this);
		loginPanel = new LoginPanel(this, cl, frame, mainSelect); 
	
		
//		gamePanel = new GamePanel(this, frame, cl);
//		gameOverPanel = new GameOverPanel(this);
//		clearPanel = new ClearPanel(this);
//		rankingPanel = new RankingPanel(this);
//		infoPanel = new InfoPanel(this);
//		
//		// 모든 패널의 레이아웃을 null로 변환
		loginPanel.setLayout(null);
		mainSelect.setLayout(null);
		stayPanel.setLayout(null);
//		gamePanel.setLayout(null);
//		gameOverPanel.setLayout(null);
//		clearPanel.setLayout(null);
//		rankingPanel.setLayout(null);
//		infoPanel.setLayout(null);
//		
		// 프레임에 패널들을 추가한다.(카드 레이아웃을 위한 패널들)
		frame.getContentPane().add(loginPanel, "login");
		frame.getContentPane().add(mainSelect, "mainSelect");
		frame.getContentPane().add(stayPanel, "stay");
//		frame.getContentPane().add(gameOverPanel, "gameover");
//		frame.getContentPane().add(clearPanel, "clear");
//		frame.getContentPane().add(rankingPanel, "ranking");
//		frame.getContentPane().add(infoPanel, "info");
		
		cl.show(frame.getContentPane(), "login"); // start패널을 카드레이아웃 최상단으로 변경
		loginPanel.requestFocus(); // 리스너를 start패널에 강제로 줌
		
		
		frame.setVisible(true); // 창 보이게하기
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mainSelect.stay) {
			cl.show(frame.getContentPane(), "stay"); 
			stayPanel.requestFocus();
		}
	}

}
