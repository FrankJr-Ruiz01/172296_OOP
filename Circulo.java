package figuras;

public class Circulo {
	public double radio;
	
	public Circulo(double id) {
		this.radio = id/100;
	}
	public double calcularCircunferencia() {
		return Math.PI * (2*radio);
	}
	public double calcularArea() {
		return Math.PI * (radio*radio);
	}

}
