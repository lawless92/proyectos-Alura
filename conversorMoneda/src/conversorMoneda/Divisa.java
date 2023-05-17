package conversorMoneda;


public enum Divisa {

		USD_EUR("0.929"), USD_GBP("0.877"), USD_JPY("130.634"), USD_KRW("1297.84"), EUR_USD("1.075"), EUR_GBP("0.879"),
		EUR_JPY("140.558"), EUR_KRW("1396.36"), GBP_USD("1.222"), GBP_EUR("1.136"), GBP_JPY("159.725"),
		GBP_KRW("1586.8"), JPY_USD("0.007"), JPY_EUR("0.007"), JPY_GBP("0.006"), JPY_KRW("9.933"), KRW_USD("0.0007"),
		KRW_EUR("0.0007"), KRW_JPY("0.100"), KRW_GBP("0.0006");

		private  String valorDivisa;

		private Divisa(String valordivisa) {
			this.valorDivisa = valordivisa;
		}

		
		public String getValorDivisa() {
				
			return this.valorDivisa;
}
 
		public  String gettipoDivisa() {
			return this.name();			
		}
}