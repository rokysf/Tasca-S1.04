package n1exercici2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class DniTest {

	@ParameterizedTest	
	@CsvSource({"10345628, K", "37689206, A", "98403769, V", "36225724, B", "45617809, T", 
			"89256110, X", "32656709, K", "56239078, F", "44674121, W", "36515707, X"})

	public void testLletraDni(int numero, char lletraEsperada) {
				
		assertEquals(lletraEsperada, CalculDni.calcularDni(numero));
	}

}

