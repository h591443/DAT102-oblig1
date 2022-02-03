package no.hvl.data102;

public class Filmarkiv { 
	
	private Film[] FilmTab; 
	private int antall; 
	
	public Filmarkiv() {  
		
		FilmTab = new Film[100]; 
		antall = 0;
	}  
	
	public void visFilm(int nr) {
		for (int i = 0; i < FilmTab.length; i++ ) {  
			if(FilmTab[i].getFilmnr() == nr) { 
				System.out.println(FilmTab[i].toString()); 
			}
		}
	} 
	

	public void leggTilFilm(Film nyFilm) { 
		
		if (antall == FilmTab.length) { 
			utvid(FilmTab); 
			FilmTab[antall++] = nyFilm;
			
		}
	} 
	public boolean finnFilm(int filmNr) {  
		
		boolean funnet = false; 
		
		for(Film a : FilmTab) { 
			if (a.getFilmnr() == filmNr) { 
				funnet = true; 
			} 
		} 
		return funnet;
	}
 
	private void utvid(Film[] FilmTab) { 
		
		Film[] nyTab = new Film[FilmTab.length + 10]; 
		for (int i = 0; i < FilmTab.length; i++) {  
			nyTab[i] = FilmTab[i]; 
		}
		FilmTab = nyTab; 
	} 
	
	private Film[] trimTab(Film[] Filmtab, int n) {
		// n er antall elementer
		Film[] nytab = new Film[n];
		int i = 0;
		while (i < n) {
			nytab[i] = FilmTab[i];
			i++;
		}
		return nytab;
	}
			
	public boolean slettFilm(int filmnr) { 
		boolean slett = false; 
		for (int i = 0;i < antall; i++) {  
			if(FilmTab[i].getFilmnr() == filmnr) { 
				FilmTab[i] = null;  
				slett = true;  
			}
		} 
			return slett;
	}

	public Film[] soekTittel(String delstreng) {

		int sum = 0;
		for ( int i = 0; i < antall; i++) { 
			if (FilmTab[i].getTittel(delstreng).contains(delstreng)) {  
				sum++; 
			} 
		}  
		Film[] soekTabell = new Film[sum]; 
				for(int i = 0; i<FilmTab.length; i++) { 
					if(FilmTab[i].getTittel(delstreng) == delstreng) { 
						FilmTab[i] = soekTabell[i]; 
					}
				}
			
		return soekTabell;
	}

	public int antall(Sjanger sjanger) {
		int teller = 0;
		for (int i = 0; i < antall; i++) {
			if (FilmTab[i].getSjanger(sjanger) == sjanger) {
				teller++;
			}
		}
		return teller;
	}
	
	public int antall() {

		return antall;
	}
	
}
