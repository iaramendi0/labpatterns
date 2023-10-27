package factory;

import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		SymptomFactory a = new SymptomFactory();
		Covid19Pacient p1=new Covid19Pacient("aitor", 35,a);
		new PacientSymptomGUI(p1);
		
		
		Medicament m=new Medicament("Ibuprofeno", a);
		MedicalGUI mgui=new MedicalGUI(m);
		

	}

}
