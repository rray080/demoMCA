package jdbcDemo.form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FacultyRegistrationForm {

	private JFrame frame;
	private JTextField textName;
	private JTextField textAge;
	private JTextField textMobile;
	private JTextField textQualification;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyRegistrationForm window = new FacultyRegistrationForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FacultyRegistrationForm() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 552, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(154, 41, 46, 14);
		frame.getContentPane().add(lblName);
		
		textName = new JTextField();
		textName.setBounds(300, 37, 175, 23);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(111, 257, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginForm();
				frame.dispose();
			}
		});
		btnLogin.setBounds(391, 257, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblage = new JLabel("Age");
		lblage.setBounds(154, 82, 46, 14);
		frame.getContentPane().add(lblage);
		
		JLabel lblmobile = new JLabel("Mobie");
		lblmobile.setBounds(154, 127, 46, 14);
		frame.getContentPane().add(lblmobile);
		
		JLabel lblQualification = new JLabel("Qualifiction");
		lblQualification.setBounds(154, 173, 76, 20);
		frame.getContentPane().add(lblQualification);
		
		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(300, 79, 175, 23);
		frame.getContentPane().add(textAge);
		
		textMobile = new JTextField();
		textMobile.setColumns(10);
		textMobile.setBounds(300, 124, 175, 23);
		frame.getContentPane().add(textMobile);
		
		textQualification = new JTextField();
		textQualification.setColumns(10);
		textQualification.setBounds(300, 170, 175, 23);
		frame.getContentPane().add(textQualification);
	}
}
