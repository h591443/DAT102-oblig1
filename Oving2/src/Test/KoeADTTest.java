package Test;
 
import no.hvl.dat102.kjedet.*;
import no.hvl.dat102.exceptions.*; 
import no.hvl.dat102.adt.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class KoeADTTest {
 
	private Integer a0 = 1; 
	private Integer a1 = 2; 
	private Integer a2 = 3;
	private Integer a3 = 4;
	private Integer a4 = 5; 
	private KoeADT <Integer> Koe;  
	
	protected abstract KoeADT<Integer> reset();
	
	@BeforeEach 
	public void setup() { 
		Koe = reset();
	} 
	@Test 
	
	public void innKoeTest() { 
		Koe.innKoe(a1); 
		assertEquals(a1, Koe.foerste()); 
	
	} 
	@Test
	public void foersteTest() {
		Koe.innKoe(a1);
		assertTrue(Koe.foerste().equals(a1));
		Koe.innKoe(a2); 
	}
	 
	@Test
	public void utKoeTest() {
		Koe.innKoe(a1);
		Koe.innKoe(a2);
		Koe.utKoe();
		assertEquals(a2,Koe.foerste());
		assertFalse(Koe.erTom()); 
	}
	@Test
	public final void KoeErTom() { 
		assertTrue(Koe.erTom());  
	}
}
