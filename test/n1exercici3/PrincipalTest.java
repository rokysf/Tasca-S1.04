package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PrincipalTest {

	@Test
	public void testExcepcio() {

		assertThrows(ArrayIndexOutOfBoundsException.class, () -> Principal.imprimirLlista());

	}

}
