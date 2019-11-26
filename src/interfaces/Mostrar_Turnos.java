package interfaces;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.SwingConstants;

import objetos.Control_Pacientes;
import objetos.Paciente;

import java.awt.Font;
import java.awt.GridLayout;

public class Mostrar_Turnos extends JFrame {

	public Mostrar_Turnos(Control_Pacientes access, Paciente user) {
		
//		JLabel lblMainTitle = new JLabel("Usted posee los siguientes turnos asignados a su usuario");
//		lblMainTitle.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblMainTitle.setHorizontalAlignment(SwingConstants.CENTER);
//		getContentPane().add(lblMainTitle, BorderLayout.NORTH);
		
		setTitle("Turnos asignados a su usuario");
		
		int len = user.mostrar_turnos().size();
		
		Container c = this.getContentPane();
		GridLayout lay = new GridLayout(len,2);
		c.setLayout(lay);
		
		JLabel cosas[] = new JLabel[6];
		for (int i=0;i<len;i++) {
			cosas[2*i] = new JLabel(user.mostrar_turnos().get(i).getFecha());
			cosas[(2*i)+1] = new JLabel("     Con el doctor: " + user.mostrar_turnos().get(i).getProfesional());
			
		}
		
		for (int i=0;i<len*2;i++) {
			c.add(cosas[i]);
		}

	}

}
