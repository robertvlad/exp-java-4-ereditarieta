package org.java.pojo;

import java.time.LocalDate;

public class Boss extends Persona{
	
	private int bonus;
	private int dividendi;

	public Boss(String nome, String cognome, LocalDate dataNascita, String CF, int bonus, int dividendi) {
		
		super(nome, cognome, dataNascita, CF);
		
		setBonus(bonus);
		setDividendi(dividendi);
	}
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getDividendi() {
		return dividendi;
	}

	public void setDividendi(int dividendi) {
		this.dividendi = dividendi;
	}
	
	
	@Override
	public String toString() {
		
		return "| (B) Nome Cognome: " + getNome() + " - " + getCognome() + " | Data di nascita: " + getDataNascita() + " | Codice: " + getCF() + " | Bonus: " + getBonus() + " | Dividendi: " + getDividendi() + " |";	
		}
}
