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

import AlfonsoPortfolioInheritance.HomePageFrame;
import AlfonsoPortfolioInheritance.ProfileFrame;


//AboutMeFrame class inheriting from the base class Frame
class AboutMeFrame extends Frame {
	private JPanel contentPane;
	private JPanel Panel_2;
	
	String S1 = ("• Basic Java" );
    String S2 = ("• PowerPoint");
    String S3 = ("•Video Editing");
    String H1 = ("Watching Movie");
    String H2 = ("Gaming");
    String H3 = ("Cycling");
    String T1 = ("Driving");
    String T2 = ("Playing Drums");
	
    public AboutMeFrame(int width, int height) {
        super(width, height);// Invoke the base class constructor
        setTitle("About Me ");
        // Add about me frame components and functionality
        contentPane = new JPanel();
        setBounds(100, 100, 1084, 598);
        setUndecorated(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Panel_1 = new JPanel();
		Panel_1.setBackground(new Color(128, 128, 128));
		Panel_1.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		Panel_1.setBounds(0, 33, 344, 566);
		contentPane.add(Panel_1);
		Panel_1.setLayout(null);
		
		JPanel BasicSkills_pnl = new JPanel();
		BasicSkills_pnl.setBackground(new Color(128, 128, 128));
		BasicSkills_pnl.setLayout(null);
		BasicSkills_pnl.setBounds(83, 215, 167, 217);
		Panel_1.add(BasicSkills_pnl);
		
		JLabel BasicSkill = new JLabel("Basic Skills");
		BasicSkill.setForeground(new Color(255, 255, 255));
		BasicSkill.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		BasicSkill.setHorizontalAlignment(SwingConstants.CENTER);
		BasicSkill.setBounds(40, 0, 87, 23);
		BasicSkills_pnl.add(BasicSkill);
		
		JLabel lblJava = new JLabel("• Basic Java");
		lblJava.setForeground(new Color(255, 255, 255));
		lblJava.setHorizontalAlignment(SwingConstants.CENTER);
		lblJava.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblJava.setBounds(35, 65, 99, 23);
		BasicSkills_pnl.add(lblJava);
		
		JLabel PowerPoint = new JLabel("• PowePoint");
		PowerPoint.setForeground(new Color(255, 255, 255));
		PowerPoint.setHorizontalAlignment(SwingConstants.CENTER);
		PowerPoint.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		PowerPoint.setBounds(40, 115, 94, 23);
		BasicSkills_pnl.add(PowerPoint);
		
		JLabel VideoEditing = new JLabel("•Video Editing");
		VideoEditing.setForeground(new Color(255, 255, 255));
		VideoEditing.setHorizontalAlignment(SwingConstants.CENTER);
		VideoEditing.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		VideoEditing.setBounds(35, 165, 122, 23);
		BasicSkills_pnl.add(VideoEditing);
		
		JLabel About_Me = new JLabel("ABOUT ME");
		About_Me.setHorizontalAlignment(SwingConstants.CENTER);
		About_Me.setForeground(Color.WHITE);
		About_Me.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 70));
		About_Me.setBounds(0, 46, 344, 101);
		Panel_1.add(About_Me);
		
		
		
		Panel_2 = new JPanel();
		Panel_2.setBackground(new Color(128, 128, 128));
		Panel_2.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		Panel_2.setBounds(342, 33, 742, 566);
		contentPane.add(Panel_2);
		Panel_2.setLayout(null);
		
		JLabel Talent_lbl = new JLabel("TALENT");
		Talent_lbl.setForeground(new Color(255, 255, 255));
		Talent_lbl.setBounds(235, 305, 253, 37);
		Panel_2.add(Talent_lbl);
		Talent_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Talent_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 45));
		
		JPanel WatchingMovie_pnl = new JPanel();
		WatchingMovie_pnl.setBackground(new Color(128, 128, 128));
		WatchingMovie_pnl.setLayout(null);
		WatchingMovie_pnl.setBounds(35, 66, 170, 171);
		Panel_2.add(WatchingMovie_pnl);
		
		JLabel WatchingMovie = new JLabel("");
		WatchingMovie.setBackground(new Color(128, 128, 128));
		WatchingMovie.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\WatchingMovie.png"));
		WatchingMovie.setBounds(10, 15, 155, 145);
		WatchingMovie_pnl.add(WatchingMovie);
		
		JPanel Gaming_pnl = new JPanel();
		Gaming_pnl.setBackground(new Color(128, 128, 128));
		Gaming_pnl.setBounds(285, 66, 170, 171);
		Panel_2.add(Gaming_pnl);
		Gaming_pnl.setLayout(null);
		
		JLabel Gaming = new JLabel("");
		Gaming.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Gaming.png"));
		Gaming.setBounds(15, 15, 138, 138);
		Gaming_pnl.add(Gaming);
		
		
		JPanel Cycling_pnl = new JPanel();
		Cycling_pnl.setBackground(new Color(128, 128, 128));
		Cycling_pnl.setLayout(null);
		Cycling_pnl.setBounds(530, 59, 180, 178);
		Panel_2.add(Cycling_pnl);
		
		JLabel Cycling = new JLabel("");
		Cycling.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Cycling.png"));
		Cycling.setBounds(15, 19, 155, 138);
		Cycling_pnl.add(Cycling);
		
		JLabel Gaming_lbl = new JLabel("Gaming");
		Gaming_lbl.setForeground(new Color(255, 255, 255));
		Gaming_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		Gaming_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Gaming_lbl.setBounds(285, 241, 170, 25);
		Panel_2.add(Gaming_lbl);
		
		JLabel Cycling_lbl = new JLabel("Cycling");
		Cycling_lbl.setForeground(new Color(255, 255, 255));
		Cycling_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Cycling_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		Cycling_lbl.setBounds(530, 235, 180, 25);
		Panel_2.add(Cycling_lbl);
		
		JLabel Driving_lbl = new JLabel("Driving");
		Driving_lbl.setForeground(new Color(255, 255, 255));
		Driving_lbl.setBounds(140, 531, 180, 25);
		Panel_2.add(Driving_lbl);
		Driving_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Driving_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel Driving_pnl = new JPanel();
		Driving_pnl.setBackground(new Color(128, 128, 128));
		Driving_pnl.setLayout(null);
		Driving_pnl.setBounds(140, 353, 180, 178);
		Panel_2.add(Driving_pnl);
		
		JLabel Driving = new JLabel("");
		Driving.setBounds(15, 27, 150, 130);
		Driving_pnl.add(Driving);
		Driving.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Driving.png"));
		
		JPanel PlayingDrums_pnl = new JPanel();
		PlayingDrums_pnl.setBackground(new Color(128, 128, 128));
		PlayingDrums_pnl.setLayout(null);
		PlayingDrums_pnl.setBounds(397, 353, 180, 178);
		Panel_2.add(PlayingDrums_pnl);
		
		JLabel PlayingDrums = new JLabel("");
		PlayingDrums.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Playing Drums.png"));
		PlayingDrums.setBounds(15, 19, 155, 138);
		PlayingDrums_pnl.add(PlayingDrums);
		
		JLabel PlayingDrums_lbl = new JLabel("Playing Drums");
		PlayingDrums_lbl.setForeground(new Color(255, 255, 255));
		PlayingDrums_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		PlayingDrums_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		PlayingDrums_lbl.setBounds(397, 531, 180, 25);
		Panel_2.add(PlayingDrums_lbl);
		
		JLabel WatchingMovie_lbl = new JLabel("Watching Movie");
		WatchingMovie_lbl.setForeground(new Color(255, 255, 255));
		WatchingMovie_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		WatchingMovie_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		WatchingMovie_lbl.setBounds(35, 241, 170, 25);
		Panel_2.add(WatchingMovie_lbl);
		
		JLabel Hobbies_lbl = new JLabel("HOBBIES");
		Hobbies_lbl.setForeground(new Color(255, 255, 255));
		Hobbies_lbl.setBounds(260, 18, 213, 37);
		Panel_2.add(Hobbies_lbl);
		Hobbies_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 45));
		Hobbies_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel Strip_pnl = new JPanel();
		Strip_pnl.setBounds(0, 0, 1084, 35);
		Strip_pnl.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		Strip_pnl.setBackground(new Color(255, 255, 255));
		contentPane.add(Strip_pnl);
		Strip_pnl.setLayout(null);
		
		final JLabel Back_lbl = new JLabel("Back");
		Back_lbl.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Back.png"));
		Back_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Back_lbl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				HomePageFrame Frame = new HomePageFrame(1100, 635);
				Frame.setVisible(true);
				dispose();
			}
			public void mouseEntered(MouseEvent arg0) {
				Back_lbl.setForeground(Color.RED);
			}public void mouseExited(MouseEvent arg0) {
				Back_lbl.setForeground(Color.BLACK);
			}
		});
		Back_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		Back_lbl.setBounds(1010, 0, 74, 35);
		Strip_pnl.add(Back_lbl);
	}
}