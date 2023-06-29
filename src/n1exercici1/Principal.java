package n1exercici1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Month> mesos = new ArrayList<Month>();
		
		afegirMesos(mesos);
					
		for (Month month : mesos) {
			System.out.println(month);
		}
	
	}

	public static void afegirMesos(ArrayList<Month> mesos) {
		
		mesos.add(new Month("gener"));
		mesos.add(new Month("febrer"));
		mesos.add(new Month("març"));
		mesos.add(new Month("abril"));
		mesos.add(new Month("maig"));
		mesos.add(new Month("juny"));
		mesos.add(new Month("juliol"));
		mesos.add(new Month("agost"));
		mesos.add(new Month("setembre"));
		mesos.add(new Month("octubre"));
		mesos.add(new Month("novembre"));
		mesos.add(new Month("desembre"));
	}
	
}
