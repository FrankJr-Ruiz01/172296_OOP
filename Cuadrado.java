package figuras;

public class Cuadrado {
public double longitud;
	
	public Cuadrado(double id) {
		this.longitud = id/100;
	}
	public double calcularDiagonal() {
		return Math.sqrt(longitud*longitud + longitud*longitud);
	}
	public double calcularPerimetro() {
		return longitud*4;
	}
	public double calcularArea() {
		return longitud*longitud;
	}

}
