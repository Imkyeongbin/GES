package och12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class MemberDao {
	// Singleton작성
	// DBCP이용해서 private Connection getConnection() {}구현
	private static MemberDao instance;
	private MemberDao() {
		
	}
	public static MemberDao getInstance() {
		if(instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}
	private Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		}catch(Exception e) {System.out.println(e.getMessage());	}
		return conn;
	}
	public int check(String id, String passwd) throws SQLException {
		int result =0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT passwd FROM member2 WHERE id = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
//			System.out.println("rs첫번째"+rs.toString());
			if(rs.next()) {
//				System.out.println(rs.toString());

				String dbPasswd = rs.getString(1);
				if(dbPasswd.equals(passwd)) {
					result =1;
				}else result = 0;
			}else {
				result = -1;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}
		return result;
	}
	public List<Member> list() throws SQLException{
		List<Member> list = new ArrayList<Member>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member2";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
//			System.out.println("rs첫번째>"+rs.toString());
			if(rs.next()) {
				do {
					Member member = new Member();
					member.setId(rs.getString(1));
//					member.setPasswd(rs.getString(2));
					member.setName(rs.getString(3));
					member.setAddress(rs.getString(4));
					member.setTel(rs.getString(5));
					member.setReg_date(rs.getDate(6));
//					System.out.println("member>"+member.toString());
					list.add(member);
				}while(rs.next());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}
		return list;
	}
}
