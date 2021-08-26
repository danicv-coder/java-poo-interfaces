package interfaces;

import interfaces.modelo.Curriculum;
import interfaces.modelo.Hoja;
import interfaces.modelo.Informe;

public class EjemploImprenta {

	public static void main(String[] args) {
		Curriculum cv = new Curriculum("resumnen laboral...", "Daniel Calderon", "Programacion");
		cv.addExperiencia("javascript").addExperiencia("java").addExperiencia("php").addExperiencia("typescript");

		Informe informe = new Informe("Daniel calderon", "José paredes", "El libro del mas allá.");
		
		imprimir(cv);
		imprimir(informe);
	}

	public static void imprimir(Hoja imprimble) {
		System.out.println(imprimble.imprirmir());
	}

}
