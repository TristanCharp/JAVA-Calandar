package com.itii.planning;

import java.util.Date;

public class Tache {
	private String nom;
	private Date date;
	private String details;
	
	public String getNom() {
		return this.nom;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public String getdetails() {
		return this.details;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void getdetails(String details) {
		this.details = details;
	}
}
