package oAjax;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
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
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		}catch(Exception e) {System.out.println(e.getMessage());	}
		return conn;
	}
	//member1
	public int confirm(String id) throws SQLException {
		int result =1;
		Connection conn = null;
//		String sql = "SELECT * FROM member1 WHERE id ='"+id+"'";
		String sql = "SELECT ID from member1 where id=?";
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) result = 1;
			else result = 0;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(rs!=null) rs.close();
			if(pstmt!= null) pstmt.close();
			if(conn != null) conn.close();
		}
		return result;
	}
	
}
