package Interfases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Control_Pacientes;
import Objetos.Paciente;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;

public class Sacar_Turno extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Sacar_Turno(Control_Pacientes sys,Paciente user) {
		setTitle("Turno");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1548558000000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(20, 10, 388, 20);
		contentPane.add(spinner);

		
		JButton btnSacarTurno = new JButton("Sacar turno");
		btnSacarTurno.setBounds(20, 44, 388, 191);
		btnSacarTurno.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String fecha = spinner.getValue().toString();
				if (sys.buscar_turno(fecha)) {
					user.sacar_Turno(fecha);
					sys.crear_turno(user, fecha);
					JOptionPane.showMessageDialog(null,"El turno se a creado",".",JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"Fecha no disponible",".",JOptionPane.INFORMATION_MESSAGE);
				}
			} 
		});
		contentPane.add(btnSacarTurno);
		
		
	}
}
