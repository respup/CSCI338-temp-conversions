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
		// Frame and main panel setup
		//-------------------------------------------------------------
		JFrame frame = new JFrame("Temperature Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();  	// main panel to add other sub-panels to
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		//-------------------------------------------------------------
		
		// Fahrenheit to celsius panel
		// ----------------------------------------------------------
		FahrenheitPanel panelFahrenheit = new FahrenheitPanel();
		mainPanel.add(panelFahrenheit);
		// ----------------------------------------------------------
		
		// Celsius to fahrenheit panel
		// ----------------------------------------------------------
		CelsiusPanel cPanel = new CelsiusPanel();
		mainPanel.add(cPanel);
		// ----------------------------------------------------------
		
		// Kelvin to celsius panel
		// ----------------------------------------------------------
		KelvinToCelsiusPanel panelkc = new KelvinToCelsiusPanel();
		mainPanel.add(panelkc);
		// ----------------------------------------------------------
		
		// Celsius to kelvin panel
		//----------------------------------------------------------
		CelsiusToKelvinPanel panelCelsiusKelvin = new CelsiusToKelvinPanel();
		mainPanel.add(panelCelsiusKelvin);
		//----------------------------------------------------------
		
		// Rankine panel
		//----------------------------------------------------------
		RankinePanel rPanel = new RankinePanel();
		mainPanel.add(rPanel);
		
		frame.getContentPane().add(mainPanel);		// add main panel to frame
		frame.pack();
		frame.setVisible(true);
		//----------------------------------------------------------
		
//      JFrame cFrame = new JFrame("Celsius");
//		cFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		cFrame.getContentPane().add(cPanel);
//		cFrame.pack();
//		cFrame.setVisible(true);
		
	}
}
