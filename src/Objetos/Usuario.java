package Objetos;

public abstract class Usuario {
	protected int dni;
	protected String nombre;
	protected String domicilio;
	protected String mail;
	protected int telefono;
	protected String usuario;
	protected String password;
	
	
	public Usuario(int dni, String nombre, String domicilio, String mail, int telefono, String usuario,
			String password) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.mail = mail;
		this.telefono = telefono;
		this.usuario = usuario;
		this.password = password;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	public abstract boolean soyPro();
	
	public boolean soyYo(String usuario, String password) {
		return ((usuario+" "+password).equals(this.usuario+" "+this.password));
	}
	
	
}
