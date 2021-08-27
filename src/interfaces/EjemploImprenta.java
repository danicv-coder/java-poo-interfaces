package interfaces;

import interfaces.modelo.Curriculum;
import interfaces.modelo.Generos;
import interfaces.modelo.Imprimible;
import interfaces.modelo.Informe;
import interfaces.modelo.Libro;
import interfaces.modelo.Pagina;
import interfaces.modelo.Persona;

public class EjemploImprenta {

	public static void main(String[] args) {
		Curriculum cv = new Curriculum("resumnen laboral...", new Persona("Daniel", "Calderon"), "Programacion");
		cv.addExperiencia("javascript").addExperiencia("java").addExperiencia("php").addExperiencia("typescript");

		Informe informe = new Informe(new Persona("Alexander", "Finol"), new Persona("Andres", "Rosales"),
				"El libro del mas alla");

		Libro libro = new Libro(new Persona("Robert", "kisgman"), "The walking dead", Generos.TERROR);
		libro.addPaginas(new Pagina("Temporada 1: el comienzo de todo"))
				.addPaginas(new Pagina("Temporada 2: el mundo oscuro"))
				.addPaginas(new Pagina("Temporada 3: aqui no es aqui"));

		imprimir(cv);
		imprimir(informe);
		System.out.println("\n");
		imprimir(libro);
	}

	public static void imprimir(Imprimible imprimible) {
		System.out.println(imprimible.imprimir());
	}

}
