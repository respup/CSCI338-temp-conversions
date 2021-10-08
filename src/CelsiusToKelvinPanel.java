import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CelsiusToKelvinPanel extends JPanel
{
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField celsius;

	//-----------------------------------------------------------------
	//  Constructor: Sets up the main GUI components.
	//-----------------------------------------------------------------
	public CelsiusToKelvinPanel()
	{
		inputLabel = new JLabel("Enter Celsius temperature:");
		outputLabel = new JLabel("Temperature in Kelvin: ");
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
			int celsiusTemp, kelvinTemp;

			String text = celsius.getText();		

			celsiusTemp = Integer.parseInt(text);
			kelvinTemp = celsiusTemp + 273;

			resultLabel.setText(Integer.toString(kelvinTemp));
		}
	}
}
