package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;  
import no.hvl.data102.adt.FilmArkivADT; 

public class Meny {
 
	private Tekstgrensesnitt tekstg; 
	private FilmArkivADT filmarkiv; 
	
	public Meny(FilmArkivADT filmarkiv) { 
		tekstg = new Tekstgrensesnitt(); 
		this.filmarkiv= filmarkiv;  
	} 
	public void start() {
		
	}
}
