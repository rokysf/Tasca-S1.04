package n1exercici3;

public class Principal {

	public static void main(String[] args) {

		try {
			imprimirLlista();
		} catch (Exception e) {
			System.out.println("Error fora dels limits del index");
		}

	}

	public static void imprimirLlista() {
		int[] llista = { 1, 2, 3 };
		System.out.println(llista[3]);
	}


}
