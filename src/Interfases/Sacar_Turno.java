package Interfases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Control_Pacientes;
import Objetos.Paciente;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Sacar_Turno extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldMedico;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Sacar_Turno(Control_Pacientes sys, Paciente user) {
		setTitle("Turno");
		setBounds(100, 100, 450, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JSpinner spinner = new JSpinner();         
		spinner.setModel(new SpinnerDateModel(new Date(1548558000000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(20, 10, 388, 20);
		contentPane.add(spinner);
		
		
		JLabel lblNombreMdico = new JLabel("Nombre médico:");
		lblNombreMdico.setBounds(20, 41, 196, 14);
		contentPane.add(lblNombreMdico);
		
		txtFieldMedico = new JTextField();
		txtFieldMedico.setBounds(20, 63, 388, 20);
		contentPane.add(txtFieldMedico);
		txtFieldMedico.setColumns(10);
		
		JButton btnSacarTurno = new JButton("Sacar turno");
		btnSacarTurno.setBounds(20, 113, 388, 57);
		btnSacarTurno.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String fecha = spinner.getValue().toString();
				String medico = txtFieldMedico.getText();
				if (sys.buscar_turno(fecha)) {
					user.sacar_Turno(fecha, medico); //se agrega el turno al Vector mis_Turnos del :Paciente
					sys.crear_turno(user, fecha, medico);
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
