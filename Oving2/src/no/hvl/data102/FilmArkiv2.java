package no.hvl.data102;

import no.hvl.data102.adt.FilmArkivADT;

public class FilmArkiv2 implements FilmArkivADT {

	LinearNode<Film> start;  
	private int antall;
	
	public FilmArkiv2(){ 
		start = new LinearNode<Film>();  
		this.antall = 0;
		
	} 
	
	public boolean finnFilm(int nr) {  
		
		boolean finnes = false;
		
		for (int i = 0; i<antall; i++) 
			if (start.getElement().getFilmnr() == nr) { 
				finnes = true; 
			}
		return finnes;
	}  
	
	public void leggTilFilm(Film nyFilm) { 
		LinearNode<Film> nyNode = new LinearNode<>(nyFilm); 
		
		nyNode.setNeste(start);
		start=nyNode; 
		antall++;
	}
	
	public boolean slettFilm(int filmnr) {
		
		boolean slett = false; 
		LinearNode<Film> denne = start; 
		LinearNode<Film> forrige = null; 
		
		if (denne.getElement() == null) {
			slett = false;
		}
		else if (denne.getElement().getFilmnr() == filmnr) {  
			start = denne.getNeste(); 
			slett = true; 
			antall--; 
		}else { 
			while(denne.getNeste().getElement() != null) {  
				if(denne.getNeste().getElement().getFilmnr() == filmnr) { 
					forrige = denne.getNeste(); 
					denne.setNeste(forrige.getNeste()); 
					antall--; 
					slett = true;
				}
				
			}
			
		} 
		return slett;
	}  
	
	public Film[] soeekTittel(String delstreng) { 
		Film[] soekTab = new Film [antall()]; 
		int sum = 0;
		
		for (int i = 0; i< antall; i++) { 
			if(start.getElement().getTittel(delstreng).contains(delstreng)) { 
				soekTab[i] = start.getElement(); 
				sum++;
			} 
			start.getNeste();
		} 
		return soekTab;
	}
	
	public int antall(Sjanger sjanger) { 
		
		int sum = 0; 
		
		for(int i = 0; i < antall;i++) { 
			if (start.getElement().getSjanger(sjanger) == sjanger) { 
				sum++; 
			} 
			start = start.getNeste();
		}
		
		return sum;
	}
	
	public int antall() { 
		return antall; 
	}

	@Override
	public void visFilm(int nr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean finnes(int nr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	} 
	
	
} 
