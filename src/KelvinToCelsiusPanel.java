import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class KelvinToCelsiusPanel extends JPanel
{
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField kelvin;

	//-----------------------------------------------------------------
	//  Constructor: Sets up the main GUI components.
	//-----------------------------------------------------------------
	public KelvinToCelsiusPanel()
	{
		inputLabel = new JLabel("Enter Kelvin temperature:");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("---");

		kelvin = new JTextField(5);
		kelvin.addActionListener(new TempListener());

		add(inputLabel);
		add(kelvin);
		add(outputLabel);
		add(resultLabel);

		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.orange);
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
			int celsiusTemp, kelvinTemp;

			String text = kelvin.getText();		

			kelvinTemp = Integer.parseInt(text);
			celsiusTemp = kelvinTemp - 273;

			resultLabel.setText(Integer.toString(celsiusTemp));
		}
	}
}
