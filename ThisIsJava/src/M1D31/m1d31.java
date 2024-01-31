package M1D31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class m1d31 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:mysql://192.168.111.200:3306/m1d31", "java", "mysql");

			// 매개변수화된 SQL 문 작성
			String sql = "" + "INSERT INTO users (userid, userPW, name, birthYear, addr, email) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";

			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "jwshin");
			pstmt.setString(2, "12345");
			pstmt.setString(3, "신지원");
			pstmt.setInt(4, 1998);
			pstmt.setString(5, "경상남도 창원시 의창구 창원대학로 20");
			pstmt.setString(6, "jwshin@codehows.com");

			// SQL 문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);

			// PreparedStatement 닫기
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					// 연결 끊기
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}
}
