package Practicas;

public class cadenainvertida {
	
	public static void main(String[] args) {
		
		String palabra="Hola Mundo";
		System.out.println(invertirPalabra(palabra, palabra.length()-1));
		
	}
	public static String invertirPalabra(String palabra, int longitud) {
		
		if(longitud==0) {
			return palabra.charAt(longitud)+"";
		}else {
			return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
		}
	}

}
