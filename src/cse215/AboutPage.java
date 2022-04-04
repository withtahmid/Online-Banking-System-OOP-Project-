
package cse215;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AboutPage extends JFrame{
	private Container c;
	private ImageIcon icon;
	//private JPanel singPanel, logPanel, usrPanel;
	private JButton zero, backButton;
	AboutPage(int x, int y)
	{
		/*********************** Same Everywhere**********************/
		Color backgroundColor = new Color(133,172,233);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("About this project and us");
		this.setBounds(x,y, 1000,1000);
		this.setResizable(false);
		this.c = this.getContentPane();
		this.c.setLayout(null);
		this.c.setBackground(backgroundColor);  
		this.icon = new ImageIcon(getClass().getResource("images/icon.png"));
		this.setIconImage(icon.getImage());
		/**************************************************/
		
		zero = new JButton(); zero.setBounds(0,0,0,0); c.add(zero);
		
//######################## Project ####################################################

		JLabel project = new JLabel("Project");
		project.setBounds(50,50,700,50);
		project.setFont(new Font("Arial", Font.BOLD,25));
		c.add(project);

		JLabel projectName = new JLabel("Name: Internet Banking System");
		projectName.setBounds(150,100,700,50);
		projectName.setFont(new Font("Arial", Font.PLAIN,25));
		c.add(projectName); 

		JLabel courseName = new JLabel("Course: CSE215 (Programming Language II)");
		courseName.setBounds(150,150,700,50);
		courseName.setFont(new Font("Arial", Font.PLAIN,25));
		c.add(courseName); 

		JLabel languageName = new JLabel("Language Used: Java and Swing for Graphics");
		languageName.setBounds(150,200,700,50);
		languageName.setFont(new Font("Arial", Font.PLAIN,25));
		c.add(languageName); 
		
//######################## Developers ####################################################

		// *************** Rubyda ****************************

		JLabel developers = new JLabel("Developers");
		developers.setBounds(50,275,700,50);
		developers.setFont(new Font("Arial", Font.BOLD,25));
		c.add(developers);

		JPanel rubydaPanel = new JPanel();
		rubydaPanel.setLayout(null);
		rubydaPanel.setBounds(150, 350, 700, 150);
		rubydaPanel.setBackground(new Color(150,190,250));
		c.add(rubydaPanel);

		JLabel rubydaNameLabel = new JLabel("Name: Rubyda Hossain");
		rubydaNameLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		rubydaNameLabel.setBounds(20,10,300,50);
		rubydaPanel.add(rubydaNameLabel);

		JLabel rubydaIdLabel = new JLabel("ID: 2012674642");
		rubydaIdLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		rubydaIdLabel.setBounds(20,50,300,50);
		rubydaPanel.add(rubydaIdLabel);

		JLabel rubydaUniLabel = new JLabel("Undergraduate student in CSE at North South University");
		rubydaUniLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		rubydaUniLabel.setBounds(20,90,700,50);
		rubydaPanel.add(rubydaUniLabel);



		// *************** Ferdoiushi ****************************

		JPanel ferdoushiPanel = new JPanel();
		ferdoushiPanel.setLayout(null);
		ferdoushiPanel.setBounds(150, 525, 700, 150);
		ferdoushiPanel.setBackground(new Color(150,190,250));
		c.add(ferdoushiPanel);

		JLabel ferdoushiNameLabel = new JLabel("Name: Fardoushi Rahman Sweety");
		ferdoushiNameLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		ferdoushiNameLabel.setBounds(20,10,400,50);
		ferdoushiPanel.add(ferdoushiNameLabel);

		JLabel ferdousiIdLabel = new JLabel("ID: 2112414642");
		ferdousiIdLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		ferdousiIdLabel.setBounds(20,50,300,50);
		ferdoushiPanel.add(ferdousiIdLabel);

		JLabel ferdoushiUniLabel = new JLabel("Undergraduate student in CSE at North South University");
		ferdoushiUniLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		ferdoushiUniLabel.setBounds(20,90,700,50);
		ferdoushiPanel.add(ferdoushiUniLabel);



		// *************** Tahmid ****************************

		JPanel tahmidPanel = new JPanel();
		tahmidPanel.setLayout(null);
		tahmidPanel.setBounds(150, 700, 700, 150);
		tahmidPanel.setBackground(new Color(150,190,250));
		c.add(tahmidPanel);

		JLabel tahmidNameLabel = new JLabel("Name: Md. Tahmid Ahmed Rakib");
		tahmidNameLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		tahmidNameLabel.setBounds(20,10,400,50);
		tahmidPanel.add(tahmidNameLabel);

		JLabel tahmidIdLabel = new JLabel("ID: 2021179642");
		tahmidIdLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		tahmidIdLabel.setBounds(20,50,300,50);
		tahmidPanel.add(tahmidIdLabel);

		JLabel tahmidUniLabel = new JLabel("Undergraduate student in CSE at North South University");
		tahmidUniLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		tahmidUniLabel.setBounds(20,90,700,50);
		tahmidPanel.add(tahmidUniLabel);



		//###########################################################################

		backButton = new JButton("Back");
		backButton.setBackground(new Color(96,96,96));
		backButton.setFont(new Font("Gotham", Font.PLAIN,20));
		backButton.setForeground(Color.WHITE);
		backButton.setBounds(450, 875, 100,50);
		c.add(backButton);


		backButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				Point point = getLocation();
				int x = (int)point.getX(); int y = (int)point.getY();
				MainPage main = new MainPage(x,y);
				main.setVisible(true);	
				dispose();
			}
		});

		
	}
}
