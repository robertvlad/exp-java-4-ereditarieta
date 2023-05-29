package org.java.pojo;

import java.time.LocalDate;

public class Persona {
	
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private String CF;
	
	public Persona(String nome, String cognome, LocalDate dataNascita, String CF) {
		
		setNome(nome);
		setCognome(cognome);
		setDataNascita(dataNascita);
		setCF(CF);		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}
	
	
	@Override
	public String toString() {

		return "| (P) Nome Cognome: " + getNome() + " - " + getCognome() + " | Data di nascita: " + getDataNascita() + " | Codice: " + getCF() + " |";
	}
}
