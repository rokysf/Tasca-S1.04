package n1exercici2;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculDniTest {

	@ParameterizedTest
    @CsvSource({
            "76583909, G",
            "87654321, X",
            "98765432, M",
            "45678901, G",
            "23456789, D",
            "12345678, Z",
            "54321098, C",
            "98765433, Y",
            "12965433, B",
            "67588330, R"
    })
	
	public void testCalculDni(int numDni, char lletraEsperada) {
        
        assertEquals(lletraEsperada, CalculDni.calculDni(numDni));
    }
	
}
