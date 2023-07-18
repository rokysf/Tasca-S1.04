package n1exercici2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix un dni per calcular la seva lletra");
		int dni = sc.nextInt();
		CalculDni.calculDni(dni);
		sc.close();	
	}	
}
