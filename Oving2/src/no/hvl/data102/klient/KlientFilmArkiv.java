package no.hvl.data102.klient;

import no.hvl.data102.Film; 
import no.hvl.data102.FilmArkiv2;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.adt.FilmArkivADT;



public class KlientFilmArkiv {
 
	
	 public static void main(String[] args) { 
		  FilmArkivADT film1 = new Filmarkiv();  
		  Meny meny = new Meny(film1); 			
		  meny.start(); 						 
		 } 
		 
}
