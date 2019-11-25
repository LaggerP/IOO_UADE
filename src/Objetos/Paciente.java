package Objetos;

import java.util.Vector;

public class Paciente extends Usuario {
	
	private Vector<Turno> mis_Turnos;
	
	
	public Paciente(int dni, String nombre, String domicilio, String mail, int telefono, String usuario, String password) {
		super(dni, nombre, domicilio, mail, telefono, usuario, password);
		mis_Turnos = new Vector<Turno>();

	}


	public void sacar_Turno(String fecha, String medico) {
		mis_Turnos.add(new Turno(this, medico, fecha));
	}
	
	public Vector<Turno> mostrar_turnos() {
		return this.mis_Turnos;
	}

}