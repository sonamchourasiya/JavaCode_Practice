package com.sunbeam;

import java.util.Date;
import java.util.Objects;

public class Project {
int id;
String title;
int teamSize;
java.util.Date startDate;
String technology;
public Project() {
	
}
public Project(int id, String title, int teamSize, Date startDate, String technology) {
	super();
	this.id = id;
	this.title = title;
	this.teamSize = teamSize;
	this.startDate = startDate;
	this.technology = technology;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getTeamSize() {
	return teamSize;
}
public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}
public java.util.Date getStartDate() {
	return startDate;
}
public void setStartDate(java.util.Date startDate) {
	this.startDate = startDate;
}
public String getTechnology() {
	return technology;
}
@Override
public int hashCode() {
	return Objects.hash(id, startDate, teamSize, technology, title);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Project other = (Project) obj;
	return id == other.id && Objects.equals(startDate, other.startDate) && teamSize == other.teamSize
			&& Objects.equals(technology, other.technology) && Objects.equals(title, other.title);
}
public void setTechnology(String technology) {
	this.technology = technology;
}
@Override
public String toString() {
	return "Project [id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", startDate=" + startDate
			+ ", technology=" + technology + "]";
}

}
