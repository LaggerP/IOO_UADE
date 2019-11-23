package Interfases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registrar_Paciente extends JFrame {

	private JPanel contentPane;
	private JTextField dni;
	private JTextField nombre;
	private JTextField domicilio;
	private JTextField mail;
	private JTextField telefono;
	private JTextField usuario;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Registrar_Paciente(Login system) {
		setTitle("Registrar Paciente");
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(46, 13, 46, 13);
		contentPane.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(46, 42, 46, 13);
		contentPane.add(lblNombre);
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setBounds(46, 71, 76, 13);
		contentPane.add(lblDomicilio);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setBounds(46, 110, 46, 13);
		contentPane.add(lblMail);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(46, 139, 76, 13);
		contentPane.add(lblTelefono);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(46, 172, 46, 13);
		contentPane.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(46, 201, 76, 13);
		contentPane.add(lblPassword);
		
		dni = new JTextField();
		dni.setBounds(153, 10, 96, 19);
		contentPane.add(dni);
		dni.setColumns(10);
		
		nombre = new JTextField();
		nombre.setBounds(153, 39, 96, 19);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		domicilio = new JTextField();
		domicilio.setBounds(153, 68, 96, 19);
		contentPane.add(domicilio);
		domicilio.setColumns(10);
		
		mail = new JTextField();
		mail.setBounds(153, 107, 96, 19);
		contentPane.add(mail);
		mail.setColumns(10);
		
		telefono = new JTextField();
		telefono.setBounds(153, 136, 96, 19);
		contentPane.add(telefono);
		telefono.setColumns(10);
		
		usuario = new JTextField();
		usuario.setBounds(153, 169, 96, 19);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		password = new JTextField();
		password.setBounds(153, 198, 96, 19);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnCrearPaciente = new JButton("CREAR PACIENTE");
		btnCrearPaciente.setBounds(117, 232, 162, 21);
		contentPane.add(btnCrearPaciente);
		btnCrearPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				system.registrar_Paciente(	Integer.parseInt(dni.getText()), 
											nombre.getText(), 
											domicilio.getText(), 
											mail.getText(), 
											Integer.parseInt(telefono.getText()), 
											usuario.getText(), 
											password.getText()
										);
				JOptionPane.showMessageDialog(null,"El usuario se a creado",".",JOptionPane.INFORMATION_MESSAGE);

			}
		});
		
		
	}


}
