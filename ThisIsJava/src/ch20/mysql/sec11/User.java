package ch20.mysql.sec11;

import lombok.Data;

@Data
public class User {

	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
}