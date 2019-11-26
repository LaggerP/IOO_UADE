package interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objetos.Control_Pacientes;
import objetos.Login;
import objetos.Paciente;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Acceso extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

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
		setBounds(100, 100, 450, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Login system = new Login();
		Control_Pacientes sistema = new Control_Pacientes();
		
		JLabel imgLabel = new JLabel(new ImageIcon(Acceso.class.getResource("/Imagenes/LogoUADE.png")));
		imgLabel.setForeground(Color.YELLOW);
		imgLabel.setBounds(10, 0, 414, 191);
		contentPane.add(imgLabel);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(87, 198, 61, 16);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(173, 196, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(87, 232, 76, 16);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(173, 230, 96, 20);
		contentPane.add(passwordField);
		
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(139, 275, 173, 38);
		btnIngresar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Paciente a = system.paciente_login(textField.getText(), new String(passwordField.getPassword()));

				if (a == null)
					JOptionPane.showMessageDialog(null,"No existe ese Usuario con esa Contraseña","Error",JOptionPane.INFORMATION_MESSAGE);
				
				else if (a != null) { // si el paciente existe
					Menu_Paciente pantalla = new Menu_Paciente(sistema, a);
					pantalla.setVisible(true);
				}
			} 
		 });

		contentPane.add(btnIngresar);
		
		JButton btnRegistrarPaciente = new JButton("Registrar paciente");
		btnRegistrarPaciente.setBounds(139, 324, 173, 38);
		btnRegistrarPaciente.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Registrar_Paciente pantalla = new Registrar_Paciente(system);
				pantalla.setVisible(true);
			} 
		});
		contentPane.add(btnRegistrarPaciente);
		

	}
}
