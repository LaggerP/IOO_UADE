package Objetos;

import java.util.Vector;

public class Profesional extends Usuario{

	
	public Profesional(int dni, String nombre, String domicilio, String mail, int telefono, String usuario,
			String password) {
		super(dni, nombre, domicilio, mail, telefono, usuario, password);
	}

	@Override
	public boolean soyPro() {
		// TODO Auto-generated method stub
		return true;
	}

	
	


}