//********************************************************************
//  Fahrenheit.java       Java Foundations
//
//  Demonstrates the use of text fields.
//********************************************************************

import javax.swing.JFrame;

public class Fahrenheit
{
	//-----------------------------------------------------------------
	//  Creates and displays the temperature converter GUI.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Fahrenheit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FahrenheitPanel panel = new FahrenheitPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
		
		
        	JFrame cFrame = new JFrame("Celsius");
		cFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		CelsiusPanel cPanel = new CelsiusPanel();
		cFrame.getContentPane().add(cPanel);

		cFrame.pack();
		cFrame.setVisible(true);
		
	}
}
