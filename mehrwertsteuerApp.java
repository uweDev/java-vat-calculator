/*
This is a Open-Source-Software.
This open source software was released on 12.12.2019 by Uwe Hellmann and D. Doubler and is subject to the MIT License.
You can download this Open-Source-Software from here: https://github.com/uweDev/java-vat-calculator
*/

import javax.swing.JOptionPane;

public class mehrwertsteuerApp {
	public static void main(String[] args) {
		
		// Set the data types
		String currencyString, amountString, totalString;
		double vatDoubleCalculates, vatDouble, totalDouble, amountDouble;

		// Input windows
		currencyString	= JOptionPane.showInputDialog("Währung eingeben: ");
		vatDouble	= Integer.parseInt(JOptionPane.showInputDialog("Mehrwertsteuersatz eingeben: "));
		amountString	= JOptionPane.showInputDialog("Nettorechnungsbetrag eingeben: ");

		// Replaces comma with period and change the data type
		amountString	= amountString.replace(',', '.');
		amountDouble	= Double.valueOf(amountString);
		
		// Calculates gross amount
		vatDoubleCalculates	= vatDouble * amountDouble / 100;
		totalDouble		= vatDoubleCalculates + amountDouble;
		
		// Change the data types and replaces period with comma
		totalString	= String.valueOf(totalDouble);
		amountString	= String.valueOf(amountDouble);
		amountString	= amountString.replace('.', ',');
		totalString	= totalString.replace('.', ',');
		
		// Results output
		JOptionPane.showMessageDialog(
			null, "Ihre Eingaben lauteten: \n\n" + "Währung: " 
			+ currencyString + "\n" + "Mehrwertsteuersatz: " + vatDouble + "%" 
			+ "\n" + "Rechnungsbetrag: " + amountString + " " + currencyString + "\n\n" 
			+ "Ihr Ergebnis lautet: \n\n" + "Nettorechnungsbetrag: " 
			+  amountString + " " + currencyString + "\n" + "Mehrwertsteuer: " + vatDouble + " " + currencyString + "\n" 
			+ "Gesamtbetrag (Brutto): " + totalString + " " + currencyString
		);
	}
}
