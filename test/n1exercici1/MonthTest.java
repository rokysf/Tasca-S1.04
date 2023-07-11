package n1exercici1;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MonthTest {

	@Test
	public void testPosicions() {
			
		ArrayList<Month> mesos = new ArrayList<Month>();
		Principal.afegirMesos(mesos);
		
		assertEquals(12, mesos.size());
	}
	
	@Test
	public void testNull() {
	
		ArrayList<Month> mesos = new ArrayList<Month>();
		Principal.afegirMesos(mesos);
	
		assertNotNull(mesos);
	}	
		
	@Test
	public void testComprobarNom() {
		ArrayList<Month> mesos = new ArrayList<Month>();
		Principal.afegirMesos(mesos);
		
		assertEquals("agost", mesos.get(7).getName());
	}
	
}
