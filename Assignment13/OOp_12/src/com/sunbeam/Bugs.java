package com.sunbeam;

public class Bugs {
	private int id;
	private String tittle;
	private String description;
	private String status;
	private int assigned_to;
	private String created;
	private String modified;
	
	public Bugs()
	{
		
	}

	public Bugs(int id, String tittle, String description, String status, int assigned_to, String created,
			String modified) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.description = description;
		this.status = status;
		this.assigned_to = assigned_to;
		this.created = created;
		this.modified = modified;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(int assigned_to) {
		this.assigned_to = assigned_to;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}
	

}
