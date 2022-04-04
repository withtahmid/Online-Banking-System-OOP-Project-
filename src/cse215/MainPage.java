package cse215;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainPage extends JFrame{
	private Container c;
	private ImageIcon icon;
	//private JPanel singPanel, logPanel, usrPanel;
	private JButton zero, signpButton, loginButton, exitButton, helpButton, aboutButtons;
	MainPage(int x, int y)
	{
		/*********************** Same Everywhere**********************/
		Color backgroundColor = new Color(133,172,233);
		Font labelFont, errorFont;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Welcome");
		this.setBounds(x,y, 1000,1000);
		this.setResizable(false);
		this.c = this.getContentPane();
		this.c.setLayout(null);
		this.c.setBackground(backgroundColor);  
		this.icon = new ImageIcon(getClass().getResource("images/icon.png"));
		this.setIconImage(icon.getImage());
		/**************************************************/
		
		zero = new JButton(); zero.setBounds(0,0,0,0); c.add(zero);

		
		ImageIcon bankImg = new ImageIcon(getClass().getResource("images/bank2.png"));
		JLabel bankIcon = new JLabel(bankImg);
		bankIcon.setBounds(300,50,350,350);
		c.add(bankIcon);


		JLabel welcome = new JLabel("WELCOME to OMUK BANK");
		welcome.setFont(new Font("Didot",Font.BOLD,45));
		welcome.setBounds(150, 425, 800,100);
		c.add(welcome);


		// JLabel system = new JLabel("INTERNET BANKING SYSTEM");
		// system.setFont(new Font("Didot",Font.BOLD,45));
		// system.setBounds(150, 300, 800,100);
		// c.add(system);



		loginButton = new JButton("USER LOGIN");
		loginButton.setBackground(new Color(10,93,201));
		loginButton.setForeground(Color.WHITE);
		loginButton.setFont(new Font("Didot",Font.BOLD,25));
		loginButton.setBounds(175,600,250,75);
		c.add(loginButton);



		// JLabel notAcc = new JLabel("Are you a new user?");
		// notAcc.setFont(new Font("Cambria", Font.BOLD,16));
		// notAcc.setBounds(385, 625, 200,50);
		// c.add(notAcc);


		
		signpButton = new JButton("NEW ACCOUNT");
		signpButton.setBounds(525,600,250,75);
		signpButton.setBackground(new Color(204,102,0));
		signpButton.setForeground(Color.WHITE);
		signpButton.setFont(new Font("Didot",Font.BOLD,25));
		c.add(signpButton);


		helpButton = new JButton("HELP");
		helpButton.setBackground(new Color(0,153,0));
		helpButton.setForeground(Color.WHITE);
		helpButton.setFont(new Font("Didot",Font.BOLD,15));
		helpButton.setBounds(100,800,100,50);
		c.add(helpButton);


		aboutButtons = new JButton("ABOUT  THIS  PROJECT  AND  US");
		aboutButtons.setBackground(new Color(96,96,96));
		aboutButtons.setForeground(Color.WHITE);
		aboutButtons.setFont(new Font("Didot",Font.BOLD,18));
		aboutButtons.setBounds(285,800,400,50);
		c.add(aboutButtons);


		exitButton = new JButton("EXIT");
		exitButton.setBackground(Color.RED);
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Didot",Font.BOLD,15));
		exitButton.setBounds(770,800,100,50);
		c.add(exitButton);


		signpButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				Point point = getLocation();
				int x = (int)point.getX(); int y = (int)point.getY();
				SignupPage signup = new SignupPage(x,y);
				signup.setVisible(true);
				dispose();
			}
		});

		loginButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				Point point = getLocation();
				int x = (int)point.getX(); int y = (int)point.getY();
				LoginPage login = new LoginPage(x,y);
				login.setVisible(true);	
				dispose();
			}
		});
		helpButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				Point point = getLocation();
				int x = (int)point.getX(); int y = (int)point.getY();
				HelpPage help = new HelpPage(x,y);
				help.setVisible(true);
				dispose();
			}
		});
		aboutButtons.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				Point point = getLocation();
				int x = (int)point.getX(); int y = (int)point.getY();
				AboutPage about = new AboutPage(x,y);
				about.setVisible(true);	
				dispose();
			}
		});
		
		exitButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});

		
	}
}