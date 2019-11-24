package Objetos;

import java.util.Vector;

public class Control_Pacientes {

	private Vector<Turno> turnosDados;

	public Control_Pacientes() {
		this.turnosDados = new Vector<Turno>();
	}

	// verifica la disponibilidad del turno segun la fecha
	public boolean buscar_turno(String fecha) {
		for (Turno dia : turnosDados) {
			if (dia.getFecha().compareTo(fecha) == 0)
				return false;
		}
		return true;
	}

	public void crear_turno(Paciente user, String profesional, String fecha) {
		turnosDados.add(new Turno(user, profesional, fecha));
	}

	public void mostrar_turnos() {

	}

}
