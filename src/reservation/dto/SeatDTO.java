package reservation.dto;

public class SeatDTO {

	int movieID;
	String userID;
	int seatID;
	
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getSeatID() {
		return seatID;
	}
	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}
	
	public SeatDTO(int movieID, String userID, int seatID) {
		this.movieID = movieID;
		this.userID = userID;
		this.seatID = seatID;
	}
	
}
