package objetos;

public class Turno {
	
	private Paciente paciente;
	private String profesional;
	private String fecha;
	
	public Turno(Paciente paciente, String medico, String fecha) {
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

	public String getProfesional() {
		return profesional;
	}

	public void setProfesional(String profesional) {
		this.profesional = profesional;
	}
	
	public boolean paciente_Asignado(int dni) {
		return (this.getPaciente().getDni() == dni);
	}


}