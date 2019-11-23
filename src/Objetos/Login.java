package Objetos;

import java.util.Vector;

public class Login {
	private Vector<Paciente> usuarios;
	
	public Login() {
		usuarios = new Vector<Paciente>();
	}

	public Paciente paciente_login(String usuario,String password) {
		for (Paciente i: usuarios) {
			if (usuario.compareTo(i.getUsuario()) == 0) {
				if (password.compareTo(i.getPassword()) == 0) {
					return i;
				}
			}
		}
		return null;
	}
	
	
	public boolean registrar_Paciente(int dni, String nombre, String domicilio, String mail, int telefono, String usuario,
			String password) {
		if (paciente_login(usuario,password) == null) {
			usuarios.add(new Paciente (dni,nombre, domicilio, mail, telefono, usuario, password));
			return true;
		}
		return false;
	}
	

}
