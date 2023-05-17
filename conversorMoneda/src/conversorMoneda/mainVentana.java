package conversorMoneda;

import javax.swing.JOptionPane;


public class mainVentana {

	public static void main(String[] args) {

		// array y ventana para seleccionar el conversor//

		String[] monedaTemp = { "MonedaConversor", "TemperaturaConversor" };
		String opcionConversion = (String) JOptionPane.showInputDialog(null, "Seleccione el Conversor", "Conversor",
				JOptionPane.INFORMATION_MESSAGE, null, monedaTemp, monedaTemp[0]);

		if (opcionConversion == "MonedaConversor") {

			// ventana con lista despegable para selecionar el tipo de conversion//

			String selectedValue = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de Divisa",
					"Conversor moneda", JOptionPane.INFORMATION_MESSAGE, null, DivisaController.opcionesDivisas,
					DivisaController.opcionesDivisas[0]);
			DivisaController.opcionDivisa(selectedValue);

			// ventana para ingresar la cantidad a convertir//
			String entradaValor = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir");
			DivisaController.calculoDivisa(entradaValor);

		} else {

			// ventana con lista despegable para seleccionar el tipo de temperatura para
			// conversion//
			String selectedTemp = (String) JOptionPane.showInputDialog(null, "Selecione la unidad de temperatura",
					"Conversor Temperatura", JOptionPane.INFORMATION_MESSAGE, null, TempController.temperaturas,
					TempController.temperaturas[0]);

			// ventana para el ingreso de la temperatura a convertir//
			String entradaTemp = JOptionPane.showInputDialog(null, "Ingrese el valor de Temperatura a convertir");
			double calculoTemp = Double.parseDouble(entradaTemp);

			TempController.calculoTemp(calculoTemp);

		}
	
  
		//String tempValue = JOptionPane.showInputDialog(, "Seleccione la Temperatura");







		


	   









	} // fin de metodo main//


} // fin de clase mainVentana
