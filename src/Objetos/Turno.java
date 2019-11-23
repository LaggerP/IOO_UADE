package Objetos;

public class Turno {
	
	private Paciente paciente;
	private String profesional;
	private String fecha;
	
	public Turno(Paciente paciente, String medico, String fecha) {
		super();
		this.paciente = paciente;
		this.profesional = medico;
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