package Interfases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Control_Pacientes;
import Objetos.Login;
import Objetos.Paciente;
import Objetos.Profesional;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Acceso extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceso frame = new Acceso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Acceso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Login system = new Login();
		Control_Pacientes sistema = new Control_Pacientes();
		
		JTextPane txtpnUsuario = new JTextPane();
		txtpnUsuario.setText("Usuario");
		txtpnUsuario.setBounds(59, 53, 67, 19);
		contentPane.add(txtpnUsuario);
		
		JTextPane txtpnContrasea = new JTextPane();
		txtpnContrasea.setText("Contrase\u00F1a");
		txtpnContrasea.setBounds(59, 82, 67, 19);
		contentPane.add(txtpnContrasea);
		
		textField = new JTextField();
		textField.setBounds(136, 53, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 82, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnResgristrarse = new JButton("Resgristrarse");
		btnResgristrarse.setBounds(105, 175, 173, 38);
		btnResgristrarse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Registrar_Paciente pantalla = new Registrar_Paciente(system);
				pantalla.setVisible(true);
			} 
		});
		contentPane.add(btnResgristrarse);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(105, 122, 173, 38);
		btnIngresar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Paciente a = system.paciente_login(textField.getText(), textField_1.getText());
				Profesional b = system.profesional_login(textField.getText(), textField_1.getText());
				
				if (a == null && b == null) {
					JOptionPane.showMessageDialog(null,"No existe ese Usuario con esa Contraseña","Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if (b != null){
					Menu_Profesional pantalla = new Menu_Profesional(system);
					pantalla.setVisible(true);
				}
				
				else if (a != null) {
					Menu_Paciente pantalla = new Menu_Paciente(sistema, a);
					pantalla.setVisible(true);
				}
				
				else {
					JOptionPane.showMessageDialog(null,"No existe ese Usuario con esa Contraseña","Error",JOptionPane.INFORMATION_MESSAGE);
				}
			} 
		});
		contentPane.add(btnIngresar);
	}
}
