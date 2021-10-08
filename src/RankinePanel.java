
//********************************************************************
//  FahrenheitPanel.java       Java Foundations
//
//  Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RankinePanel extends JPanel
{
	private JLabel inputLabel, celOutputLabel, celResultLabel, fahOutputLabel, kelOutputLabel, fahResultLabel, kelResultLabel;
	private JTextField rankine;

	//-----------------------------------------------------------------
	//  Constructor: Sets up the main GUI components.
	//-----------------------------------------------------------------
	public RankinePanel()
	{
		inputLabel = new JLabel("Enter Rankine temperature:");
		celOutputLabel = new JLabel("Temperature in Celsius: ");
		fahOutputLabel = new JLabel("Temperature in Fahrenheit: ");
		kelOutputLabel = new JLabel("Temperature in Kelvin: ");
		celResultLabel = new JLabel("---");
		fahResultLabel = new JLabel("---");
		kelResultLabel = new JLabel("---");

		rankine = new JTextField(5);
		rankine.addActionListener(new RankineTempListener());
		
		add(inputLabel);
		add(rankine);
		add(kelOutputLabel);
		add(kelResultLabel);
		add(celOutputLabel);
		add(celResultLabel);
		add(fahOutputLabel);
		add(fahResultLabel);

		setPreferredSize(new Dimension(300, 120));
		setBackground(Color.decode("#BFE5D9"));
	}

	//*****************************************************************
	//  Represents an action listener for the temperature input field.
	//*****************************************************************
	private class RankineTempListener implements ActionListener
	{
		//--------------------------------------------------------------
		//  Performs the conversion when the enter key is pressed in
		//  the text field.
		//--------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			float rankineTemp, celsiusTemp, fahrenheitTemp, kelvinTemp;

			rankineTemp = Integer.parseInt(rankine.getText());
			celsiusTemp = (float) ((rankineTemp - 491.67) * 5/9);
			fahrenheitTemp = (float) (rankineTemp - 459.67); 
			kelvinTemp = (float) (rankineTemp * 5/9);

			celResultLabel.setText(String.format("%.2f", celsiusTemp));
			fahResultLabel.setText(String.format("%.2f", fahrenheitTemp));
			kelResultLabel.setText(String.format("%.2f", kelvinTemp));
		}
	}
}
