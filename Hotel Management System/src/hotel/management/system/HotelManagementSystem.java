package hotel.management.system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class HotelManagementSystem extends JFrame  {
	
	HotelManagementSystem(){
		setBounds(300,200,1366,565);
	//	setSize(400,300);
		
	//	setLocation(300,300);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icon/icon1.png"));
		JLabel l1 = new JLabel(i1);
		
		l1.setBounds(0,0,1366,565);
		add(l1);
		
		JLabel l2 =new JLabel("Welcome to Paradise hotels");
		l2.setBounds(20,430,1000,70);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("serif",Font.PLAIN,70));
		l1.add(l2);
		
		JButton b1 = new JButton("Next");
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setBounds(1150,450,150,50);
		l1.add(b1);
		
		setLayout(null);
		setVisible(true);
		
		
		while(true)
		{
			l2.setVisible(false);
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
			l2.setVisible(true);
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
		
		
		
		
		
	}
	
	public static void main(String[] args)
	{
		new HotelManagementSystem();
		
	}

}
