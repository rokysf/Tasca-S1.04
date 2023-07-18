package n1exercici2;

public class CalculDni {

	private static String lletrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";

	public static char calculDni(int numeroDni) {
		int resultat = numeroDni % 23;
		char lletra = lletrasDni.charAt(resultat);
		System.out.println("El DNI complert es: " + numeroDni + lletra);
		return lletra;
	}
}
