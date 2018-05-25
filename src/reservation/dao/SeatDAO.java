package reservation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import reservation.dto.MovieDTO;
import reservation.dto.SeatDTO;
import reservation.util.DatabaseUtil;

public class SeatDAO {

	public int write(int movieID, String userID, int seatID) {
		String SQL = "INSERT INTO RESERVATION_SEAT VALUES (?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, movieID);
			pstmt.setString(2, userID);
			pstmt.setInt(3, seatID);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if(conn != null) conn.close();} catch (Exception e) {e.printStackTrace();}
			try {if(pstmt != null) pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (Exception e) {e.printStackTrace();}
		}
		return -1; // 데이터베이스 오류
	}	
	
	public ArrayList<SeatDTO> getList(int movieID) {
		String SQL = "SELECT * FROM RESERVATION_SEAT WHERE movieID = ?";
		ArrayList<SeatDTO> list = new ArrayList<SeatDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, movieID);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				SeatDTO seat = new SeatDTO(rs.getInt(1), rs.getString(2), rs.getInt(3));
				list.add(seat);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if(conn != null) conn.close();} catch (Exception e) {e.printStackTrace();}
			try {if(pstmt != null) pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (Exception e) {e.printStackTrace();}
		}
		return list; // 데이터베이스 오류
	}
	
}