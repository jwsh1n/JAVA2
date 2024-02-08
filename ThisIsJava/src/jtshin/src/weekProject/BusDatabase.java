package weekProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BusDatabase {
	private Connection conn = null;
	public int busPrice;
	
	public BusDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://222.119.100.89:3382/bustickets", "bustickets", "1234");
			//System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void busSelect(String selectER,String selectBC, String nowdate, String timeS) {
		try {
			String busData = "normalbus";
			
			if(selectBC.equals("일반")) { //버스 종류에 따라 테이블 변경
				busData = "normalbus";	
			}else if (selectBC.equals("우등")) {
				busData = "honorbus";
			}else if(selectBC.equals("프리미엄")) {
				busData = "premiumbus";
			}
			String sql = "" + "SELECT * " +
			"FROM " + busData + 
					" WHERE endregion=? " +
							"and busclass=? " +
							"and nowdate=? "+
							"and bustime=? ";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, selectER);
			pstmt.setString(2, selectBC);
			pstmt.setString(3, nowdate);
			pstmt.setInt(4, Integer.parseInt(timeS));
			ResultSet rs = pstmt.executeQuery();
			
			Bus bus = new Bus();
			while(rs.next()) {
				//MemoCalendar에서 받아온 정보로 DB 데이터 뽑아내기
				//(정보 : 도착지, 버스등급, 날짜, 시간) 
				//ex)2024년 2월 8일 7시 창원 우등
				//예를들어 07시에 서울가는 일반버스를 타고싶다고 설정하고 좌석 선택으로 넘어갈 수 있도록 코딩할것
				bus.setEndregion(rs.getString("endregion"));
				bus.setBusclass(rs.getString("busclass"));
				bus.setNowdate(rs.getString("nowdate")); // 데이터베이스내에 있는 버스날짜 를 롬복 setter bus 에 저장
				bus.setBusTime(rs.getInt("bustime"));
				bus.setPrice(rs.getInt("price"));
				bus.setSeats(rs.getInt("seats"));
				
				System.out.println("데이터베이스 "+bus.getEndregion()
				+" "+bus.getBusclass()
				+" "+bus.getNowdate()
				+" "+bus.getBusTime()
				+" "+bus.getPrice()
				+" "+bus.getSeats());	
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dataBaseLogin(String userId, char[] userPw, String pw) throws ClassNotFoundException, SQLException {
		loginForm loginF = new loginForm();
		String sql = "SELECT * FROM users WHERE username = ?";
		
		// ?에 userId와 userPw
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, userId);
			ResultSet resultSet = pstmt.executeQuery();
			if (resultSet.next()) {
	
				if(pw.equals(resultSet.getString("password"))) {
					JOptionPane.showMessageDialog(loginF, "로그인 성공!", "", 3);
//					loginF.setVisible(false);
//					loginF.dispose();
					loginF.openReservationPage();
					
				} else {
					JOptionPane.showMessageDialog(loginF, "패스워드 불일치!!", "", 2);
				}
			} else {					
				JOptionPane.showMessageDialog(loginF, "해당 ID가 없음!", "", 1);
			}
			// 패스워드 관련 보안을 위해 char 배열을 클리어
	        java.util.Arrays.fill(userPw, ' ');
	        loginF.passwordField.setText("");
	        resultSet.close();
			pstmt.close();
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void busSeatInfo(String busclass) {
		String sql = "select price from "+busclass+" where busnum=1;";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			Bus bus = new Bus();
			if(rs.next()) {
				bus.setPrice(rs.getInt("price"));
				BusClassInfo.price = bus.getPrice();
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
}
