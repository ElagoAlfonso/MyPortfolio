package AlfonsoPortfolioInheritance;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import AlfonsoPortfolioInheritance.AboutMeFrame;
import AlfonsoPortfolioInheritance.HomePageFrame;


//ProfileFrame class inheriting from the base class Frame
class ProfileFrame extends Frame {
	
	private JPanel contentPane;
	
    public ProfileFrame(int width, int height) {
        super(width, height); // Invoke the base class constructor
        setTitle("Profile ");
        // Add profile frame components and functionality
        contentPane = new JPanel();
        setUndecorated(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(100, 100, 1081, 625);
		contentPane.setBackground(new Color(128, 128, 128));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Strip_pnl = new JPanel();
		Strip_pnl.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		Strip_pnl.setBackground(new Color(255, 255, 255));
		Strip_pnl.setBounds(0, 0, 1081, 35);
		contentPane.add(Strip_pnl);
		Strip_pnl.setLayout(null);
		
		final JLabel Back_lbl = new JLabel("Back");
		Back_lbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Back_lbl.addMouseListener(new MouseAdapter() {
			// Handle back label clicks
			public void mouseClicked(MouseEvent e) {
				HomePageFrame frame = new HomePageFrame(1100, 635);
				frame.setVisible(true);
				dispose();
			}
			
			// Change the color of the back label when the mouse enters
			public void mouseEntered(MouseEvent arg0) {
				Back_lbl.setForeground(Color.RED);
			}
			
			// Change the color of the back label when the mouse exits
			public void mouseExited(MouseEvent arg0) {
				Back_lbl.setForeground(Color.BLACK);
			}
		});
		Back_lbl.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Back.png"));
		Back_lbl.setBounds(1011, 0, 69, 35);
		Strip_pnl.add(Back_lbl);
		
		JLabel About_Me = new JLabel("About Me");
		About_Me.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AboutMeFrame Frame = new AboutMeFrame(1100, 635);
				Frame.setVisible(true);
				dispose();
			}
		});
		
		JPanel Profile_pnl = new JPanel();
		Profile_pnl.setBackground(new Color(128, 128, 128));
		Profile_pnl.setBounds(0, 35, 1084, 561);
		contentPane.add(Profile_pnl);
		Profile_pnl.setLayout(null);
		
		JLabel Profile_lbl = new JLabel("");
		Profile_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		Profile_lbl.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\PROFILE.png"));
		Profile_lbl.setBounds(283, 0, 372, 169);
		Profile_pnl.add(Profile_lbl);
		
		JLabel Profile_photo = new JLabel("");
		Profile_photo.setForeground(new Color(255, 255, 255));
		Profile_photo.setBackground(new Color(255, 255, 255));
		Profile_photo.setBounds(209, 174, 169, 217);
		Profile_pnl.add(Profile_photo);
		Profile_photo.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Profile_Photo.png"));
		
		JLabel Info_1 = new JLabel("Name : Elago, Alfonso Rafael A.");
		Info_1.setForeground(new Color(255, 255, 255));
		Info_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
		Info_1.setBounds(388, 120, 247, 38);
		Profile_pnl.add(Info_1);
		
		JLabel Info_2 = new JLabel("Age: 19 years old");
		Info_2.setForeground(new Color(255, 255, 255));
		Info_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
		Info_2.setBounds(388, 169, 226, 38);
		Profile_pnl.add(Info_2);
		
		JLabel Info_3 = new JLabel("Gender: Male");
		Info_3.setForeground(new Color(255, 255, 255));
		Info_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
		Info_3.setBounds(388, 220, 226, 38);
		Profile_pnl.add(Info_3);
		
		JLabel Info_4 = new JLabel("Address: Talipapa, Caloocan City");
		Info_4.setForeground(new Color(255, 255, 255));
		Info_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
		Info_4.setBounds(388, 269, 264, 38);
		Profile_pnl.add(Info_4);
		
		JLabel Info_5 = new JLabel("Year: 1st Year, 3rd Term");
		Info_5.setForeground(new Color(255, 255, 255));
		Info_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
		Info_5.setBounds(388, 318, 226, 38);
		Profile_pnl.add(Info_5);
		
		JLabel Info_6 = new JLabel("Program: BSIT - MWA");
		Info_6.setForeground(new Color(255, 255, 255));
		Info_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		Info_6.setBounds(388, 367, 226, 38);
		Profile_pnl.add(Info_6);
		
		JLabel Info_7 = new JLabel("Email: rafaelelago23@gmail.com");
		Info_7.setForeground(new Color(255, 255, 255));
		Info_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
		Info_7.setBounds(388, 416, 247, 38);
		Profile_pnl.add(Info_7);
		
    }
}
