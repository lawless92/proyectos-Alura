package conversorMoneda;

import javax.swing.JOptionPane;

public class TempController {

	protected static String[] temperaturas = { "Celsius_Farenheit", "Farenheit_Celsius" };

	private static double valorTemp = 0;

	public static double opcionTemp(String selectTemp) {
		Temperatura[] Temp = Temperatura.values();
		double opcionTemp = 0;

		for (int i = 0; i < Temp.length; i++) {
			String inputTemp = null;

			inputTemp = Temp[i].toString();
			if (selectTemp == inputTemp) {

				opcionTemp = Temp[i].getTemperatura();
			} // fin de for

			valorTemp = opcionTemp;
		}
		return valorTemp;

	}// fin de metodo opcioTemp

	public static void calculoTemp(double entradaTemp) {
		String tipoTemp = String.valueOf(entradaTemp);

		if (tipoTemp == "Celsius_Farenheit") {
			double temperatura = Double.parseDouble(tipoTemp);
			double calculoTemp = (temperatura + valorTemp);

			JOptionPane.showMessageDialog(null, "Su valor cantidad de conversion es: " + calculoTemp, null,
					JOptionPane.PLAIN_MESSAGE);

		} else if (tipoTemp == "Farenheit_Celsius") {

			double temperatura = Double.parseDouble(tipoTemp);
			double calculoTemp = (temperatura - valorTemp) + 0.55;

			JOptionPane.showMessageDialog(null, "Su valor cantidad de conversion es: " + calculoTemp, null,
					JOptionPane.PLAIN_MESSAGE);
		}

	} // fin de calculoTemp//

}
