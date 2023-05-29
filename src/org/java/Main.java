package org.java;

import java.time.LocalDate;

import org.java.pojo.Boss;
import org.java.pojo.Employee;
import org.java.pojo.Persona;

public class Main {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Hugo", "Ciccio", LocalDate.now(), "123456789");
		
		System.out.println(p1);
		
		Employee e1 = new Employee("Hugo", "Ciccio", LocalDate.now(), "123456789", 1600, true, true);
		
		System.out.println(e1);
		
		Boss b1 = new Boss("Hugo", "Ciccio", LocalDate.now(), "123456789", 20000, 30000);
		
		System.out.println(b1);
		
		System.out.println("\n------------------------------------------------------------------------\n");
		
		Persona[] arrP = {p1, e1, b1};
		
		for (int i = 0; i < arrP.length; i++) {
			
				Persona p = arrP[i];
				System.out.println(p);
				
				System.out.println("\n------------------------------------------------------------------------\n");
				if (p instanceof Employee) {
					
					Employee e = (Employee) p;
					
					System.out.println(e.getStipendio());
				}
				else if (p instanceof Boss) {
					
					Boss b = (Boss) p;
					
					System.out.println(b.getBonus());
				}
				
				System.out.println("\n------------------------------------------------------------------------\n");
		}
	}
}
