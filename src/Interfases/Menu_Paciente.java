package Interfases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Control_Pacientes;
import Objetos.Paciente;

import javax.swing.JButton;

public class Menu_Paciente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Menu_Paciente(Control_Pacientes access, Paciente user) {
		setTitle("Menu paciente");
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSacarTurno = new JButton("Sacar turno");
		btnSacarTurno.setBounds(142, 67, 154, 49);
		btnSacarTurno.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Sacar_Turno pantalla = new Sacar_Turno(access, user);
				pantalla.setVisible(true);
			} 
		});
		contentPane.add(btnSacarTurno);
		
		JButton btnVerTurno = new JButton("Ver turnos");
		btnVerTurno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mostrar_Turnos pantalla = new Mostrar_Turnos(access, user);
				pantalla.setVisible(true);
			}
		});
		btnVerTurno.setBounds(142, 138, 154, 49);
		contentPane.add(btnVerTurno);
	}

}
