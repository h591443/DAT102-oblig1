package no.hvl.data102.klient; 

import java.util.Scanner;

import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmArkivADT;

public class Tekstgrensesnitt { 
	

	public Film lesFilm() {  
		Scanner scanner = new Scanner(System.in); 
		Film film = new Film(scanner.nextInt(), scanner.nextInt(),scanner.next(),scanner.next(),scanner.next(), Sjanger.finnSjanger(null));
		scanner.close();
		
	}  
	
	 public void visFilm(Film film, FilmArkivADT arkiv) { 
		 int nr = film.getFilmnr();
		 arkiv.visFilm(nr);
		 
	 } 
}
