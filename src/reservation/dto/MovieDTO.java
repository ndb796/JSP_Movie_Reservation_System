package reservation.dto;

public class MovieDTO {

	int movieID;
	String movieTitle;
	String movieContent;
	String movieGenre;
	int movieTime;
	
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getMovieContent() {
		return movieContent;
	}
	public void setMovieContent(String movieContent) {
		this.movieContent = movieContent;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public int getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(int movieTime) {
		this.movieTime = movieTime;
	}
	
	public MovieDTO() {
		
	}
	
	public MovieDTO(int movieID, String movieTitle, String movieContent, String movieGenre, int movieTime) {
		this.movieID = movieID;
		this.movieTitle = movieTitle;
		this.movieContent = movieContent;
		this.movieGenre = movieGenre;
		this.movieTime = movieTime;
	}
}
