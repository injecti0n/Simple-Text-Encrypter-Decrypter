package crypter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CryptorApp {

	private JFrame frmXorEncoder;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtInjecti0nxrencryption;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CryptorApp window = new CryptorApp();
					window.frmXorEncoder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CryptorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmXorEncoder = new JFrame();
		frmXorEncoder.setTitle("Text {Enc-Dec} Developed by @foreignaddress");
		frmXorEncoder.getContentPane().setBackground(new Color(51, 51, 51));
		frmXorEncoder.setBounds(100, 100, 724, 254);
		frmXorEncoder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmXorEncoder.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(192, 12, 504, 40);
		frmXorEncoder.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setBackground(Color.GREEN);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(192, 63, 504, 40);
		frmXorEncoder.getContentPane().add(textField_1);
		XorUtils crypt = new XorUtils();
		JButton btnNewButton = new JButton("ENCODE");
		btnNewButton.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				String enc = textField.getText();
				String dec = textField_1.getText();
				String key = txtInjecti0nxrencryption.getText();
				byte[] Enc;
				try {
					Enc = enc.getBytes("UTF-8");
					byte [] KeyB= key.getBytes("UTF-8");
					textField_1.setText(crypt.encode_using_xor(Enc, KeyB));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(192, 164, 243, 40);
		frmXorEncoder.getContentPane().add(btnNewButton);
		
		JButton btnDecode = new JButton("DECODE");
		btnDecode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				try {
					String dec = textField_1.getText();
					String key = txtInjecti0nxrencryption.getText();
					byte [] KeyB= key.getBytes("UTF-8");
					textField.setText(crypt.decode_operation(dec, KeyB));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				 
			}
		});
		btnDecode.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		btnDecode.setBounds(453, 164, 243, 40);
		frmXorEncoder.getContentPane().add(btnDecode);
		
		JLabel lblOriginalText = new JLabel("TEXT:");
		lblOriginalText.setForeground(Color.WHITE);
		lblOriginalText.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOriginalText.setBounds(10, 6, 90, 49);
		frmXorEncoder.getContentPane().add(lblOriginalText);
		
		JLabel lblEncoded = new JLabel("ENCODED: ");
		lblEncoded.setForeground(Color.WHITE);
		lblEncoded.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEncoded.setBounds(10, 56, 160, 49);
		frmXorEncoder.getContentPane().add(lblEncoded);
		
		txtInjecti0nxrencryption = new JTextField();
		txtInjecti0nxrencryption.setBackground(Color.YELLOW);
		txtInjecti0nxrencryption.setForeground(Color.BLACK);
		txtInjecti0nxrencryption.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtInjecti0nxrencryption.setText("TextEncrypter!!!!");
		txtInjecti0nxrencryption.setColumns(10);
		txtInjecti0nxrencryption.setBounds(192, 113, 504, 40);
		frmXorEncoder.getContentPane().add(txtInjecti0nxrencryption);
		
		JLabel lblYourKey = new JLabel("YOUR KEY:");
		lblYourKey.setForeground(Color.WHITE);
		lblYourKey.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblYourKey.setBounds(10, 110, 160, 49);
		frmXorEncoder.getContentPane().add(lblYourKey);
	}
}
