package conversorMoneda;

public enum Temperatura {

	Celsius_Farenheit(32), Farenheit_Celsius(32);

	private double valorTemperatura;

	private Temperatura(double selectedTemp) {
		this.valorTemperatura = selectedTemp;
	}

	public double getTemperatura() {
		return this.valorTemperatura;
	}

	public String getTipoTemp() {
		return this.name();
	}

}

