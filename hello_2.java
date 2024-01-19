package figuras;

public class hello_2 {
	public static void main(String[] args) {
		Cuadrado miCuadrado = new Cuadrado(172296);
		System.out.println("La longitud de cada lado: " + miCuadrado.longitud);
		System.out.println("La diagonal es: " + miCuadrado.calcularDiagonal());
		System.out.println("El perimetro es: " + miCuadrado.calcularPerimetro());
		System.out.println("El area es: " + miCuadrado.calcularArea());
	}

}
