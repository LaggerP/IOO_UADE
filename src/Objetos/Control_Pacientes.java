package Objetos;

import java.util.Vector;

public class Control_Pacientes {
	private Vector<Turno> dias_Disponibles;

	public Control_Pacientes() {
		super();
		dias_Disponibles = new Vector<Turno>();
	}
	
	
	public boolean buscar_turno(String fecha) {
		for(Turno dia : dias_Disponibles) {
			if(dia.getFecha().compareTo(fecha) == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean crear_turno(Paciente user,String fecha) {
		if (buscar_turno(fecha) == true) {
			dias_Disponibles.add(new Turno(user, fecha));
			return true;
		}
		
		return false;
	}
	
	
	public void mostrar_turnos() {
		
	}
	
	
}
