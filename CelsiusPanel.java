//********************************************************************
//  FahrenheitPanel.java       Java Foundations
//
//  Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CelsiusPanel extends JPanel
{
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField celsius;

	//-----------------------------------------------------------------
	//  Constructor: Sets up the main GUI components.
	//-----------------------------------------------------------------
	public CelsiusPanel()
	{
		inputLabel = new JLabel("Enter Celsius temperature:");
		outputLabel = new JLabel("Temperature in Fahrenheit: ");
		resultLabel = new JLabel("---");

		celsius = new JTextField(5);
		celsius.addActionListener(new TempListener());

		add(inputLabel);
		add(celsius);
		add(outputLabel);
		add(resultLabel);

		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.yellow);
	}

	//*****************************************************************
	//  Represents an action listener for the temperature input field.
	//*****************************************************************
	private class TempListener implements ActionListener
	{
		//--------------------------------------------------------------
		//  Performs the conversion when the enter key is pressed in
		//  the text field.
		//--------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			int fahrenheitTemp, celsiusTemp;

			String text = celsius.getText();

			celsiusTemp = Integer.parseInt(text);
			fahrenheitTemp = (celsiusTemp*(9/5))+32;

			resultLabel.setText(Integer.toString(fahrenheitTemp));
		}
	}
}
