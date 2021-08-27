package interfaces.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Libro implements Imprimible {
	private List<Imprimible> paginas;
	private Persona autor;
	private String titulo;
	private Generos genero;

	public Libro(Persona autor, String titulo, Generos genero) {
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.paginas = new ArrayList<Imprimible>();
	}

	public Libro addPaginas(Imprimible pagina) {
		this.paginas.add(pagina);
		return this;
	}
	
	public String imprimir() {
		StringBuilder sb = new StringBuilder("titulo: ");
		sb.append(this.titulo).append("\n ").append("Autor: ").append(this.autor).append("\n ")
		.append("Genero: ").append(this.genero).append("\n ");
		for (Imprimible pag : this.paginas) {
			sb.append(pag.imprimir()).append("\n ");
		}
		return sb.toString();
	}

}
