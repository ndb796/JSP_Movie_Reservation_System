package reservation.dto;

public class UserDTO {

	private String userID;
	private String userPassword;
	private String userResidentID;
	private String userName;
	private String userPhone;
	private String userAddress;
	private String userEmail;
	private int userType;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserResidentID() {
		return userResidentID;
	}
	public void setUserResidentID(String userResidentID) {
		this.userResidentID = userResidentID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	public UserDTO(String userID, String userPassword, String userResidentID, String userName, String userPhone,
			String userAddress, String userEmail, int userType) {
		this.userID = userID;
		this.userPassword = userPassword;
		this.userResidentID = userResidentID;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.userEmail = userEmail;
		this.userType = userType;
	}
	
}
