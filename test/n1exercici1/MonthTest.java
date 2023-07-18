package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MonthTest {

	@Test
	public void testPosicions() {
			
		assertEquals(12, Principal.afegirMesos().size());
	}
	
	@Test
	public void testNull() {
	
		assertNotNull(Principal.afegirMesos());
	}	
		
	@Test
	public void testComprobarNom() {
			
		assertEquals("agost", Principal.afegirMesos().get(7).getName());
	}
	
}
