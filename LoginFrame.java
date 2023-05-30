package AlfonsoPortfolioInheritance;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import AlfonsoPortfolioInheritance.HomePageFrame;

//LoginFrame class inheriting from the base class Frame
class LoginFrame extends Frame {
		
		private JPanel contentPane;
		private JTextField Username_tf;
		private JPasswordField Password_f;
		
	    public LoginFrame(int width, int height) {
	        super(width, height); // Invoke the base class constructor
	        setTitle("Login Frame ");
	        // Add login frame components and functionality
	        
	        contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			
			contentPane.setBackground(new Color(128, 128, 128));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			Username_tf = new JTextField();
			Username_tf.setBounds(413, 263, 220, 20);
			contentPane.add(Username_tf);
			Username_tf.setColumns(10);
			Username_tf.setBorder(null);
			Username_tf.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					if (Username_tf.getText().equals("")) {
						Username_tf.setForeground(new Color(96, 96, 96));
						Username_tf.setText("Username / Email");
					}
				}
				@Override
				public void focusGained(FocusEvent e) {
					if (Username_tf.getText().equals("Username / Email")) {
						Username_tf.setForeground(Color.BLACK);
						Username_tf.setText("");
					}
				}
			});
			Password_f = new JPasswordField();
			Password_f.setBounds(411, 316, 222, 20);
			contentPane.add(Password_f);
			Password_f.setEchoChar((char) 0);
			Password_f.setBorder(null);
			Password_f.setEchoChar('●');
			Password_f.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					if (Password_f.getText().equals("")) {
						Password_f.setForeground(new Color(96, 96, 96));
						Password_f.setText("Password");
						Password_f.setEchoChar((char) 0);
					}
				}

				@Override
				public void focusGained(FocusEvent e) {
					if (Password_f.getText().equals("Password")) {
						Password_f.setForeground(Color.BLACK);
						Password_f.setText("");
					}
				}

			});
			
			JButton Login_btn = new JButton("Login");
			Login_btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String Username = Username_tf.getText();
					char[] password = Password_f.getPassword();
					String passString = new String(password);
				

						// login button function
						if(Username.equals("alfonso") && passString.equals("elago")) {
							JOptionPane.showMessageDialog(null, "Logged-in Successfully!", "",
									JOptionPane.INFORMATION_MESSAGE);
							HomePageFrame frame = new HomePageFrame(1100, 635);
							frame.setVisible(true);
							dispose();
						} else if(Username.isEmpty() && passString.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Fill-up the required fields!", "",JOptionPane.WARNING_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Invalid Email or Password!", "",JOptionPane.WARNING_MESSAGE);
						}
		

				}
			});
			Login_btn.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 23));
			Login_btn.setBounds(874, 516, 145, 41);
			contentPane.add(Login_btn);
			
			JLabel Username = new JLabel("Username:");
			Username.setForeground(Color.WHITE);
			Username.setFont(new Font("Tahoma", Font.BOLD, 20));
			Username.setBounds(293, 257, 110, 25);
			contentPane.add(Username);
			
			JLabel Password = new JLabel("Password:");
			Password.setForeground(Color.WHITE);
			Password.setFont(new Font("Tahoma", Font.BOLD, 20));
			Password.setBounds(297, 310, 104, 25);
			contentPane.add(Password);
					
			JLabel LOGIN = new JLabel("LOGIN");
			LOGIN.setForeground(Color.WHITE);
			LOGIN.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 70));
			LOGIN.setHorizontalAlignment(SwingConstants.CENTER);
			LOGIN.setBounds(346, 129, 327, 66);
			contentPane.add(LOGIN);

	    }
	}