package Proyect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainCasaApuestas extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField textField_1;
	private JLabel lblEdad;
	private JTextField textField_2;
	private JLabel lblSexo;
	private JTextField textField_3;
	private JLabel lblNewLabel_2;
	private JLabel lblEdad_1;
	private JTextField textField_4;
	private JLabel lblNewLabel_4;
	private JTextField textField_5;
	private JLabel lblCc;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainCasaApuestas frame = new MainCasaApuestas();
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
	public MainCasaApuestas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 183, 86, 20);
		contentPane.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 143, 86, 20);
		contentPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 103, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Usuario: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setBounds(10, 57, 91, 29);
		contentPane.add(lblNewLabel);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(133, 60, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(128, 0, 64));
		lblNewLabel_1.setBounds(10, 99, 91, 29);
		contentPane.add(lblNewLabel_1);
		
		lblEdad = new JLabel("Confirmar Contraseña:");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEdad.setForeground(new Color(128, 0, 64));
		lblEdad.setBounds(10, 139, 113, 29);
		contentPane.add(lblEdad);
		
		lblSexo = new JLabel("Correo:");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSexo.setForeground(new Color(128, 0, 64));
		lblSexo.setBounds(10, 179, 91, 29);
		contentPane.add(lblSexo);
		
		lblEdad_1 = new JLabel("Edad:");
		lblEdad_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEdad_1.setForeground(new Color(128, 0, 64));
		lblEdad_1.setBounds(10, 214, 91, 29);
		contentPane.add(lblEdad_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(133, 218, 86, 20);
		contentPane.add(textField_4);
		
		lblNewLabel_4 = new JLabel("Sexo:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(new Color(128, 0, 64));
		lblNewLabel_4.setBounds(10, 257, 91, 29);
		contentPane.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(133, 261, 86, 20);
		contentPane.add(textField_5);
		
		lblCc = new JLabel("CC:");
		lblCc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCc.setForeground(new Color(128, 0, 64));
		lblCc.setBounds(10, 300, 91, 29);
		contentPane.add(lblCc);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(133, 304, 86, 20);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Persona person = new Persona(null, null, null, null, null, null, null);
				
				String Nombre = person.getUsuario();
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 64));
		btnNewButton.setBounds(10, 408, 113, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("CREACIÓN DE USUARIO");
		lblNewLabel_3.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setForeground(new Color(128, 0, 64));
		lblNewLabel_3.setBounds(29, 11, 180, 28);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sevec\\Downloads\\qatar.jpg"));
		lblNewLabel_2.setBounds(81, 0, 492, 489);
		contentPane.add(lblNewLabel_2);
		
	
	}
}
