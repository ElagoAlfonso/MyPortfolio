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
import AlfonsoPortfolioInheritance.HomePageFrame;

class Educational_Background extends Frame {
	String Elem = ("PLACIDO DEL MUNDO ELEMENTARY SCHOOL");
	String JHS = ("TALIPAPA HIGH SCHOOL");
	String SHS = ("INTERNATIONAL CHRISTIAN SCHOOL OF QUEZON CITY INC.");
	String College = ("NATIONAL UNIVERSITY");

	private JPanel contentPane;
	
	 public Educational_Background(int width, int height) {
			super(width, height);
			 setTitle("Educational Background ");
			// TODO Auto-generated constructor stub
			 contentPane = new JPanel();
			 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				setBounds(100, 100, 1065, 573);
				setUndecorated(true);
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 1065, 573);
				panel.setBackground(new Color(128, 128, 128));
				contentPane.add(panel);
				panel.setLayout(null);
				
				final JLabel Back_lbl = new JLabel("Back");
				Back_lbl.setBounds(991, 11, 74, 25);
				panel.add(Back_lbl);
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
				
				Back_lbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
				Back_lbl.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Back.png"));
				
				JLabel Elementary_lbl = new JLabel("Elementary:");
				Elementary_lbl.setFont(new Font("Monospaced", Font.BOLD, 35));
				Elementary_lbl.setBounds(225, 69, 242, 51);
				panel.add(Elementary_lbl);
				Elementary_lbl.setForeground(Color.WHITE);
				
				JLabel SHS_lbl = new JLabel("Senior High School:");
				SHS_lbl.setFont(new Font("Monospaced", Font.BOLD, 35));
				SHS_lbl.setBounds(225, 305, 418, 51);
				panel.add(SHS_lbl);
				SHS_lbl.setForeground(Color.WHITE);
				
				JLabel College_lbl = new JLabel("College:");
				College_lbl.setFont(new Font("Monospaced", Font.BOLD, 35));
				College_lbl.setBounds(225, 407, 180, 51);
				panel.add(College_lbl);
				College_lbl.setForeground(Color.WHITE);
				
				JLabel JHS_lbl = new JLabel("Junior High School:");
				JHS_lbl.setFont(new Font("Monospaced", Font.BOLD, 35));
				JHS_lbl.setBounds(225, 189, 418, 51);
				panel.add(JHS_lbl);
				JHS_lbl.setForeground(Color.WHITE);
				
				JLabel School_1 = new JLabel(Elem);
				School_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				School_1.setBounds(300, 131, 453, 43);
				panel.add(School_1);
				School_1.setForeground(Color.WHITE);
				
				JLabel School_2 = new JLabel(JHS);
				School_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
				School_2.setBounds(300, 251, 453, 43);
				panel.add(School_2);
				School_2.setForeground(Color.WHITE);
				
				JLabel School_3 = new JLabel(SHS);
				School_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
				School_3.setBounds(300, 363, 593, 43);
				panel.add(School_3);
				School_3.setForeground(Color.WHITE);
				
				JLabel School_4 = new JLabel(College);
				School_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
				School_4.setBounds(300, 455, 453, 43);
				panel.add(School_4);
				School_4.setForeground(Color.WHITE);
				
				JLabel Year1 = new JLabel("2009-2016");
				Year1.setFont(new Font("Tahoma", Font.BOLD, 15));
				Year1.setBounds(652, 85, 140, 25);
				panel.add(Year1);
				Year1.setForeground(Color.WHITE);
				
				JLabel Year2 = new JLabel("2016-2020");
				Year2.setFont(new Font("Tahoma", Font.BOLD, 15));
				Year2.setBounds(653, 205, 139, 25);
				panel.add(Year2);
				Year2.setForeground(Color.WHITE);
				
				JLabel Year3 = new JLabel("2020-2022");
				Year3.setFont(new Font("Tahoma", Font.BOLD, 15));
				Year3.setBounds(653, 321, 139, 25);
				panel.add(Year3);
				Year3.setForeground(Color.WHITE);
				
				JLabel Year4 = new JLabel("2022 - Current");
				Year4.setFont(new Font("Tahoma", Font.BOLD, 15));
				Year4.setBounds(652, 417, 140, 31);
				panel.add(Year4);
				Year4.setForeground(Color.WHITE);
				
			}
		}