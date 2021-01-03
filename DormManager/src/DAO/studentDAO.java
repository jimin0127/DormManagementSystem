package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class studentDAO {
	private Connection conn;	
	private ResultSet rs;
	private PreparedStatement pstmt;
	private Statement st;
	
	public studentDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/DORM?serverTimezone=UTC";
			String dbID = "root";
			String dbPassword = "1234";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public JTable ShowTable(JTable table) {
		DefaultTableModel model = new DefaultTableModel();
		//열 이름
		model.addColumn("학번 ");
		model.addColumn("이름");
		model.addColumn("호실");
	
		try {
			String SQL = "Select * from student;";
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while(rs.next()){ //데이터가 끝날때까지 반복
				//행
				model.addRow(new Object [] {
						rs.getString("student_id"),
						rs.getString("name"),
						rs.getString("room")
				});
			}
			table.setModel(model);
		}
		catch(Exception e3){
			e3.printStackTrace();
		}
		return null;
	}
	
	public boolean login(String id, String name, String room) {

		try {
			String SQL = "Select * from student where student_id = ?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			

			while(rs.next()) {	
        	if(rs.getString("name").equals(name) && rs.getString("room").equals(room)) 
        	{
        		JOptionPane.showMessageDialog(null, "로그인 되었습니다. ");
        		return true; 
			}
        	else {
				JOptionPane.showMessageDialog(null,"다시 입력해주세요. ");
				return false;
			}
			}
			
		}
		catch(Exception e2){ //디비 오류
        	System.out.println(e2.getMessage());
        }
		return false;
	}
	
	public boolean addStudent(String id, String name, String room) {
		try {
			String SQL = "INSERT INTO student (student_id, name, room) VALUES(?, ?, ?);";
			//String SQL2 = "INSERT INTO dpoint (id, UpPoint, DownPoint) VALUES (" + id +", " + 0 + ", " + 0 + ");";
			//System.out.println(SQL2);
			//st = conn.createStatement();
			//st.executeUpdate(SQL2);
			

			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, room);
			pstmt.executeUpdate();
		}
		catch(Exception e){ //디비 오류
        	System.out.println(e.getMessage());
        }
		return false;
	}
}
