package com.sunbeam;

public class User {
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private  String dob;
	private String Stat;
	private String roll;
	private int id;
	public User(String first_name, String last_name, String email, String password, String dob, String stat,
			String roll, int id) {
	
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		Stat = stat;
		this.roll = roll;
		this.id = id;
	}
	public User()
	{
		
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
	public String getStat() {
		return Stat;
	}
	public void setStat(String stat) {
		Stat = stat;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", password="
				+ password + ", dob=" + dob + ", Stat=" + Stat + ", roll=" + roll + ", id=" + id + "]";
	}
	
	
}

	
	