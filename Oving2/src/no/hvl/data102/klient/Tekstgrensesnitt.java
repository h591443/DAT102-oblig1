package no.hvl.data102.klient; 

import java.util.Scanner;

import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmArkivADT;

public class Tekstgrensesnitt { 
	

	public Film lesFilm() {  
		Scanner scanner = new Scanner(System.in); 
		Film film = new Film(scanner.nextInt(), scanner.nextInt(),scanner.next(),scanner.next(),scanner.next(), Sjanger.finnSjanger());
		scanner.close();
		
	}  
	
	 public void visFilm(Film film, FilmArkivADT arkiv) { 
		
		 System.out.print(film.getTittel() +"/n"+ film.getFilmnr() +"/n"+ film.getAar() +"/n"+ film.getFilmselvskap() +"/n"+ film.getprodusent() +"/n"+ film.getSjanger());
		 
	 }  
	 
	 public void skrivUtFilmDelstrengITittel(FilmArkivADT film1, String delstreng) { 
 
		 Film[] Film1Tab = film1.soekTittel(delstreng); 
		 for (int i = 0; i < Film1Tab.length; i++) { 
			 if (Film1Tab[i].getTittel(delstreng).equals(delstreng)) { 
				 System.out.println(Film1Tab[i].getTittel(delstreng));
			 }
		 }
	 } 
	 public void skrivUtFilmProdusent(FilmArkivADT film1, String delstreng) {  
		 Film[] Film1Tab = film1.soekTittel(delstreng); 
		 for (int i = 0; i<Film1Tab.length; i++) { 
			 if (Film1Tab[i].getFilmselvskap().contains(delstreng)) { 
				 System.out.println(Film1Tab[i].getFilmselvskap);
			 }
		 }
	 }

}
