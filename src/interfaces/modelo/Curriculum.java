package interfaces.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja {
	private String persona;
	private String carrera;
	List<String> experiencia;

	public Curriculum(String contenido, String persona, String carrera) {
		super(contenido);
		this.persona = persona;
		this.carrera = carrera;
		this.experiencia = new ArrayList<String>();
	}

	public Curriculum addExperiencia(String ex) {
		experiencia.add(ex);
		return this;
	}

	@Override
	public String imprirmir() {
		StringBuilder sb = new StringBuilder("nombre ");
		sb.append(persona).append("\n").append("Resumen: ").append(this.contenido).append("\n").append("Profesión: ")
				.append(carrera).append("\n").append("experiencias: \n");

		for (String exp : experiencia) {
			sb.append("- ").append(exp).append("\n");
		}
		return sb.toString();
	}

}
