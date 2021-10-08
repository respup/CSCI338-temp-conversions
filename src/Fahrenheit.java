//********************************************************************
//  Fahrenheit.java       Java Foundations
//
//  Demonstrates the use of text fields.
//********************************************************************

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fahrenheit
{
	//-----------------------------------------------------------------
	//  Creates and displays the temperature converter GUI.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{	
		// Frame setup
		//-------------------------------------------------------------
		JFrame frame = new JFrame("Temperature Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();  	// main panel to add other sub-panels to
		//-------------------------------------------------------------
		
		// Fahrenheit to celsius panel
		//----------------------------------------------------------
		FahrenheitPanel panelFahrenheit = new FahrenheitPanel();
		mainPanel.add(panelFahrenheit);
		//----------------------------------------------------------
		
		// Celsius to kelvin panel
		//----------------------------------------------------------
		CelsiusToKelvinPanel panelCelsius = new CelsiusToKelvinPanel();
		mainPanel.add(panelCelsius);
		//----------------------------------------------------------
		
		frame.getContentPane().add(mainPanel);		// add main panel to frame
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
