package Objetos;

public class Turno {
	
	private Paciente paciente;
	private String fecha;
	
	
	
	
	public Turno(Paciente paciente, String fecha) {
		super();
		this.paciente = paciente;
		this.fecha = fecha;
	}



	public Paciente getPaciente() {
		return paciente;
	}
	public String getFecha() {
		return fecha;
	}
	
	
	public boolean paciente_Asignado(int dni) {
		return (this.getPaciente().getDni() == dni);
	}

}