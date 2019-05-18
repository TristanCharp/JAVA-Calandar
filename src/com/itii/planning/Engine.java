package com.itii.planning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Engine {
	private static Engine engine;
	private ArrayList<Tache> listTache = new ArrayList<Tache>();
	private int ID = 0;
	
	private Engine() {}
	
	public static Engine getEngine() {
		if(engine == null) {
			engine = new Engine();
		}
		return engine;
	}
	
	public void addTache(String nom, String date, String details) {		
		listTache.add(new Tache(nom, convertStringToDate(date), getID(), details));
	}
	
	public void deleteTache(int ID) {
		listTache.remove(getTache(ID));
	}
	
	public ArrayList<Tache> getTaches(){
		return this.listTache;
	}
	
	private Date convertStringToDate(String dateToConvert) {
		Date date = new Date();
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dateToConvert);
		} catch (ParseException e) {e.printStackTrace();}
		return date;
	}
	
	public void editTache(String nom, String date, String details, int ID){
		getTache(ID).setNom(nom);
		getTache(ID).setDate(convertStringToDate(date));
		getTache(ID).setDetails(details);
	}
	
	private int getID() {
		this.ID++;
		return ID;
	}
	
	public Tache getTache(int ID){
		for(Tache tache : listTache) {
			if(tache.getID() == ID) {
				return tache;
			}
		}
		System.out.println("Tache non trouvée !");
		return null;
	}
}
