package org.java.pojo;

import java.time.LocalDate;

public class Employee extends Persona {
	
	private int stipendio;
	private boolean tredicesima;
	private boolean quattordicesima;

	public Employee(String nome, String cognome, LocalDate dataNascita, String CF, int stipendio, boolean tredicesima, boolean quattordicesima) {
		
		super(nome, cognome, dataNascita, CF);
		
		setStipendio(stipendio);
		setTredicesima(tredicesima);
		setQuattordicesima(quattordicesima);
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	public boolean isTredicesima() {
		return tredicesima;
	}

	public void setTredicesima(boolean tredicesima) {
		this.tredicesima = tredicesima;
	}

	public boolean isQuattordicesima() {
		return quattordicesima;
	}

	public void setQuattordicesima(boolean quattordicesima) {
		this.quattordicesima = quattordicesima;
	}	
	
	
	@Override
	public String toString() {
		
		return "| (E) Nome Cognome: " + getNome() + " - " + getCognome() + " | Data di nascita: " + getDataNascita() + " | Codice: " + getCF() + " | Stipendio: " + getStipendio() + " | Tredicesima: " + isTredicesima() + " | Quattordicesima: " + isQuattordicesima() + " |";
	}
}
