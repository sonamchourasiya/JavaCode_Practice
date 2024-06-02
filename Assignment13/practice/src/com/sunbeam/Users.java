package com.sunbeam;

public class Users {
private int id;
private String first_name;
private String last_name;
private String email;
private String password;
private String dob;
private String status;
private String roll;

public Users()
{
	
}

public Users(int id, String first_name, String last_name, String email, String password, String dob, String status,
		String roll) {
	super();
	this.id = id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.email = email;
	this.password = password;
	this.dob = dob;
	this.status = status;
	this.roll = roll;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getRoll() {
	return roll;
}

public void setRoll(String roll) {
	this.roll = roll;
}

@Override
public String toString() {
	return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
			+ ", password=" + password + ", dob=" + dob + ", status=" + status + ", roll=" + roll + ", getId()="
			+ getId() + ", getFirst_name()=" + getFirst_name() + ", getLast_name()=" + getLast_name() + ", getEmail()="
			+ getEmail() + ", getPassword()=" + getPassword() + ", getDob()=" + getDob() + ", getStatus()="
			+ getStatus() + ", getRoll()=" + getRoll() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}


}