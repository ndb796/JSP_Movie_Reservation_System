package reservation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import reservation.dto.MovieDTO;
import reservation.util.DatabaseUtil;

public class MovieDAO {
	
	public int getNext() {
		String SQL = "SELECT movieID FROM RESERVATION_MOVIE ORDER BY movieID DESC";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if(conn != null) conn.close();} catch (Exception e) {e.printStackTrace();}
			try {if(pstmt != null) pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (Exception e) {e.printStackTrace();}
		}
		return -1; // 데이터베이스 오류
	}
	
	public int write(String movieTitle, String movieContent, String movieGenre, int movieTime) {
		String SQL = "INSERT INTO RESERVATION_MOVIE VALUES (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, getNext());
			pstmt.setString(2, movieTitle);
			pstmt.setString(3, movieContent);
			pstmt.setString(4, movieGenre);
			pstmt.setInt(5, movieTime);
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
	
	public boolean nextPage(int pageNumber) {
		String SQL = "SELECT * FROM RESERVATION_MOVIE WHERE movieID < ? AND movieAvailable = 1;";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, getNext() - (pageNumber) * 10);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if(conn != null) conn.close();} catch (Exception e) {e.printStackTrace();}
			try {if(pstmt != null) pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (Exception e) {e.printStackTrace();}
		}
		return false; // 데이터베이스 오류
	}
	
	
	public ArrayList<MovieDTO> getList() {
		String SQL = "SELECT * FROM RESERVATION_MOVIE ORDER BY movieID";
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MovieDTO movie = new MovieDTO();
				movie.setMovieID(rs.getInt(1));
				movie.setMovieTitle(rs.getString(2));
				movie.setMovieContent(rs.getString(3));
				movie.setMovieGenre(rs.getString(4));
				movie.setMovieTime(rs.getInt(5));
				list.add(movie);
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
	
	public MovieDTO getmovie(int movieID) {
		String SQL = "SELECT * FROM RESERVATION_MOVIE WHERE movieID = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, movieID);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MovieDTO movie = new MovieDTO();
				movie.setMovieID(rs.getInt(1));
				movie.setMovieTitle(rs.getString(2));
				movie.setMovieContent(rs.getString(3));
				movie.setMovieGenre(rs.getString(4));
				movie.setMovieTime(rs.getInt(5));
				return movie;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if(conn != null) conn.close();} catch (Exception e) {e.printStackTrace();}
			try {if(pstmt != null) pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (Exception e) {e.printStackTrace();}
		}
		return null; // 데이터베이스 오류
	}
	
	public int update(int movieID, String movieTitle, String movieContent, String movieGenre, int movieTime) {
		String SQL = "UPDATE RESERVATION_MOVIE SET movieTitle = ?, movieContent = ?, movieGenre = ?, movieTime = ? WHERE movieID = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, movieTitle);
			pstmt.setString(2, movieContent);
			pstmt.setString(3, movieGenre);
			pstmt.setInt(4, movieTime);
			pstmt.setInt(5, movieID);
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
	
	public int delete(int movieID) {
		String SQL = "DELETE FROM RESERVATION_MOVIE WHERE movieID = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, movieID);
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
	
	
}
