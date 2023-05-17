package conversorMoneda;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class DivisaController {


	protected static  String [] opcionesDivisas = {"USD_EUR", "USD_GBP", "USD_JPY","USD_KRW",
			"EUR_USD","EUR_GBP","EUR_JPY","EUR_KRW","GBP_USD","GBP_EUR","GBP_JPY",
			"GBP_KWR","JPY_USD","JPY_EUR","JPY_GBP","JPY_KRW","KRW_USD","KRW_EUR",
			"KRW_GBP","KRW_JPY"};

 private static double valorDivisa;

	DivisaController(){

	}




	public static double opcionDivisa(String selectdivisa) {
			Divisa[] divisa = Divisa.values();
			double inputDivisa = 0;
			for (Divisa element : divisa) {
				String div = element.name();

				if(selectdivisa == div ) {

				inputDivisa	 = Double.parseDouble(element.getValorDivisa());
				}
			 } // fin de for

			valorDivisa = inputDivisa;

		return valorDivisa;
		 }//fin de metodo opcio divisa
	
	



	public static void calculoDivisa(String entradaValor) {
  
		
		Double valorinput = Double.parseDouble(entradaValor);
	
		
		if(valorinput > 0  ) {
			double	calculoDivisa = valorDivisa * valorinput; 
			
			
			Math.round(calculoDivisa * 100/100d);

		JOptionPane.showMessageDialog(null, "Su valor cantidad de conversion es: " + calculoDivisa,null, JOptionPane.PLAIN_MESSAGE);
		
	}else {
	
		JOptionPane.showMessageDialog(null, "Cantidad no validad",null, JOptionPane.PLAIN_MESSAGE);	
	}

		
		} // 


	
}
