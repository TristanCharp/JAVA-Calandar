package com.itii.planning;

import java.util.Date;

public class Tache {
	private String nom;
	private Date date;
	private String details;
	private int ID;
	
	public Tache(String nom, Date date, int ID, String details) {
		this.nom = nom;
		this.date = date;
		this.ID = ID;
		this.details = details;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public String getDetails() {
		return this.details;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public int getID() {
		return this.ID;
	}
}
