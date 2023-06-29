package n1exercici2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
	
		ArrayList<Dni> llistaDni = new ArrayList<Dni>();
		afegirDni(llistaDni);
		
		ArrayList<String> taulaDni = new ArrayList<String>();
		omplirTaulaDni(taulaDni);
		
		
		
	}

	public static void afegirDni(ArrayList<Dni> llistaDni) {
		
		llistaDni.add(new Dni(10345628));
		llistaDni.add(new Dni(37689206));
		llistaDni.add(new Dni(98403769));
		llistaDni.add(new Dni(36515724));
		llistaDni.add(new Dni(45617809));
		llistaDni.add(new Dni(89256110));
		llistaDni.add(new Dni(32656709));
		llistaDni.add(new Dni(56239078));
		llistaDni.add(new Dni(44674121));
		llistaDni.add(new Dni(78779237));
	}

	public static void omplirTaulaDni(ArrayList<String> taulaDni) {
		
		taulaDni.add("T");
		taulaDni.add("R");
		taulaDni.add("W");
		taulaDni.add("A");
		taulaDni.add("G");
		taulaDni.add("M");
		taulaDni.add("Y");
		taulaDni.add("F");
		taulaDni.add("P");
		taulaDni.add("D");
		taulaDni.add("X");
		taulaDni.add("B");
		taulaDni.add("N");
		taulaDni.add("J");
		taulaDni.add("Z");
		taulaDni.add("S");
		taulaDni.add("Q");
		taulaDni.add("V");
		taulaDni.add("H");
		taulaDni.add("L");
		taulaDni.add("C");
		taulaDni.add("K");
		taulaDni.add("E");
	}


}
