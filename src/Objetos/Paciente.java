package Objetos;

import java.util.Vector;

public class Paciente extends Usuario {
	
	
	private Vector<Turno> mis_Turnos;
	
	
	public Paciente(int dni, String nombre, String domicilio, String mail, int telefono, String usuario, String password) {
		super(dni, nombre, domicilio, mail, telefono, usuario, password);
		mis_Turnos = new Vector<Turno>();

	}

	
	@Override
	public boolean soyPro() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public void sacar_Turno(String fecha) {
		mis_Turnos.add(new Turno(this, fecha));
	}
	
	
	

}