package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDao {
	private static BoardDao instance;
	private BoardDao() {}
	public static BoardDao getInstance() {
		if(instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}
	private Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		}catch(Exception e) {
			System.out.println(e.getMessage()); 
		}
		return conn;
	}
	public Board select(int num) throws SQLException {
		int result =0;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM board WHERE num = "+ num;
		Board board = new Board();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
//			System.out.println("rs첫번째"+rs.toString());
			if(rs.next()) {
				
				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setEmail(rs.getString("email"));
				board.setReadcount(rs.getInt("readcount"));
//				board.setPasswd(rs.getString("passwd"));
				board.setRef(rs.getInt("ref"));
				board.setRe_step(rs.getInt("re_step"));
				board.setRe_level(rs.getInt("re_level"));
				board.setIp(rs.getString("ip"));
				board.setReg_date(rs.getDate("reg_date"));
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
		return board;
		
	}
	public int getTotalCnt() throws SQLException {
		int tot =0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT COUNT(*) FROM board";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				tot = rs.getInt(1);
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}
		return tot;
	}
	
	public List<Board> list(int startRow, int endRow) throws SQLException{
		List<Board> list = new ArrayList<Board>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * from (select rownum rn,a.*"
				+ "from  (select * from board order by ref desc,re_step) a )"
				+ "WHERE rn between ? and ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				do {
					Board board = new Board();
					board.setNum(rs.getInt("num"));
					board.setWriter(rs.getString("writer"));
					board.setSubject(rs.getString("subject"));
//					board.setContent(rs.getString("content"));
					board.setEmail(rs.getString("email"));
					board.setReadcount(rs.getInt("readcount"));
//					board.setPasswd(rs.getString("passwd"));
					board.setRef(rs.getInt("ref"));
					board.setRe_step(rs.getInt("re_step"));
					board.setRe_level(rs.getInt("re_level"));
					board.setIp(rs.getString("ip"));
					board.setReg_date(rs.getDate("reg_date"));
					list.add(board);
				}while(rs.next());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}
		return list;
	}
	public void readCount(int num) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE board SET readcount=readcount+1 WHERE num = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		}catch(Exception e) {
				System.out.println(e.getMessage());
		}finally {
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}
	}
	public int update(Board board) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "UPDATE board SET subject=?,writer=?,email=?,passwd=?,content=?,ip=? WHERE num = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getSubject());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getPasswd());
			pstmt.setString(5, board.getContent());
			pstmt.setString(6, board.getIp());
			pstmt.setInt(7, board.getNum());
			result = pstmt.executeUpdate();
		}catch(Exception e) {
				System.out.println(e.getMessage());
		}finally {
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}
		
		return result;
	}
	public int insert(Board board) throws SQLException {
		int num = board.getNum();
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		ResultSet rs = null;
		String sql1 = "SELECT nvl(MAX(num),0) FROM board";
		String sql = "INSERT INTO board VALUES (?,?,?,?,?,?,?,?,?,?,?,sysdate)";
		String sql2= "UPDATE board set re_step = re_step+1 WHERE ref = ? and re_step > ?";
		try {
			conn = getConnection();
			// 댓글일시 추가 작업
			if(num != 0) {
				pstmt = conn.prepareStatement(sql2);
				pstmt.setInt(1, board.getRef());
				pstmt.setInt(2, board.getRe_step());
				pstmt.executeUpdate();
				pstmt.close();
				board.setRe_step(board.getRe_step()+1);
				board.setRe_level(board.getRe_level()+1);
			}
			pstmt = conn.prepareStatement(sql1);
			rs = pstmt.executeQuery();
			rs.next();
			// 일단 MAX사용
			int number = rs.getInt(1)+1;
			
			rs.close();
			if(pstmt!=null) pstmt.close();
			if(num ==0) board.setRef(number);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getSubject());
			pstmt.setString(4, board.getContent());
			pstmt.setString(5, board.getEmail());
			pstmt.setInt(6, board.getReadcount());
			pstmt.setString(7, board.getPasswd());
			pstmt.setInt(8, board.getRef()); //getRef
			pstmt.setInt(9, board.getRe_step());		//getRe_step
			pstmt.setInt(10, board.getRe_level());	//getRe_level
			pstmt.setString(11, board.getIp());
			result = pstmt.executeUpdate();
		}catch(Exception e) {
				System.out.println(e.getMessage());
		}finally {
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}
		
		return result;
	}
}
