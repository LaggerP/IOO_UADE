package Interfases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Login;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu_Profesional extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Menu_Profesional(Login access) {
		setTitle("Menu");
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegistrarProfesional = new JButton("Registrar profesional");
		btnRegistrarProfesional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrarProfesional.setBounds(110, 37, 199, 38);
		contentPane.add(btnRegistrarProfesional);
		
		JButton btnModificarProfesional = new JButton("Modificar profesional");
		btnModificarProfesional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarProfesional.setBounds(110, 154, 199, 38);
		contentPane.add(btnModificarProfesional);
	}
}
