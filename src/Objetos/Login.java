package Objetos;

import java.util.Vector;

import javax.swing.JOptionPane;

public class Login {
	private Vector<Paciente> usuarios;
	private Vector<Profesional> profesionales;
	
	public Login() {
		super();
		usuarios = new Vector<Paciente>();
		profesionales = new Vector<Profesional>();
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
	
	public Profesional profesional_login(String usuario,String password) {
		for (Profesional i: profesionales) {
			if (usuario.compareTo(i.getUsuario()) == 0) {
				if (password.compareTo(i.getPassword()) == 0) {
					return i;
				}
				
			}
		}
		return null;
	}
	
	public boolean registrar_Profesional(int dni, String nombre, String domicilio, String mail, int telefono, String usuario,
			String password) {
		if (profesional_login(usuario,password) == null) {
			profesionales.add(new Profesional (dni,nombre, domicilio, mail, telefono, usuario, password));
			return true;
		}
		return false;
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
