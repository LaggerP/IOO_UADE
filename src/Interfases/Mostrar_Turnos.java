package Interfases;

import javax.swing.JFrame;

import Objetos.Control_Pacientes;
import Objetos.Paciente;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Mostrar_Turnos extends JFrame {

	public Mostrar_Turnos(Control_Pacientes access, Paciente user) {
		
		JLabel lblMainTitle = new JLabel("Usted posee los siguientes turnos asignados a su usuario");
		lblMainTitle.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMainTitle.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblMainTitle, BorderLayout.NORTH);
	}

}
