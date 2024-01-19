package figuras;

public class hello3_1 {
	public static void main(String[] args) {
		Circulo miCirculo = new Circulo(172296);
		System.out.println("El radio es: " + miCirculo.radio);
		System.out.println("La circunferencia es: " + miCirculo.calcularCircunferencia());
		System.out.println("El area es: " + miCirculo.calcularArea());
	}

}
