package models;

public class student {
  private int rollnumber;
	public student(int rollnumber, String firstname, String lastname, String username, String email, String password) {
	super();
	this.rollnumber = rollnumber;
	Firstname = firstname;
	this.lastname = lastname;
	this.username = username;
	Email = email;
	this.password = password;
}
	public student() {
	super();
	// TODO Auto-generated constructor stub
}
	public int getRollnumber() {
	return rollnumber;
}
public void setRollnumber(int rollnumber) {
	this.rollnumber = rollnumber;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
	private String Firstname;
	private String lastname;
	private String username;
	private String Email;
	private String password;
	
	
	
}
