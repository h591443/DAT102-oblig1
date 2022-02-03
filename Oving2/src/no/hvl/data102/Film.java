package no.hvl.data102;

public class Film { 
	
		private int filmNr; 
		private String produsent; 
		private String tittel; 
		private int aar; 
		private String filmselvskap;   
		private Sjanger sjanger; 
		 
		public Film() { 
			filmNr = 0; 
			produsent = "  ";  
			tittel = "   "; 
			aar = 0; 
			filmselvskap = "  ";
		}
		
		public Film(int filmNr, String produsent, String tittel, int aar, String filmselvskap) { 
		
		this.filmNr = filmNr;
		this.produsent = produsent;
		this.tittel = tittel; 
		this.aar = aar; 
		this.filmselvskap = filmselvskap; 
	}  
	
	// get og set 
	
	public int getFilmnr() { 
		return filmNr;   
	} 
	public String getTittel(String tittel) { 
		return tittel;   
	} 
	public int getAar(int aar) { 
		return aar;   
	}  
	public String getFilmselvskap(String filmselvskap) { 
		return filmselvskap;   
	}  
	public Sjanger getSjanger(Sjanger sjanger) { 
		return sjanger; 
	}  
	public String getprodusent(String produsent) { 
		return produsent;   
	} 
	public void setProdusent(String produsent) { 
		this.produsent = produsent; 
	} 
	public void setFilmnr(int filmNr) { 
		this.filmNr = filmNr; 
	} 
	
	public void setTittel(String tittel) { 
		this.tittel = tittel;  
	} 
	
	public void setAar(int aar) { 
		this.aar = aar; 
	} 
	
	public void setFilmselvskap(String filmselvskap) { 
		this.filmselvskap = filmselvskap;  
	} 
	 
	public void setSjanger(Sjanger sjanger) { 
		this.sjanger = sjanger;
	}
	
	@Override 
	public int hashCode() { 
	    Integer temp = filmNr; 
	    return temp.hashCode();   
	}
	
	public boolean equals(Film filmA) { 
		// ??? 
		boolean like = false; 
		
		if (filmA.getFilmnr() == filmNr) { 
			like = true;
		}
		return like;
	}
		
}