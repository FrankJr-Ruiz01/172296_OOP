package IniciarPrograma;

import java.util.Scanner;	
	public class PrimerMayuscula {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Escriba una cadena:");
	        String cadena = scanner.nextLine();
	        String resultado = LetraMayus(cadena);
	        System.out.println(resultado);
	        String Cadenainvertida = Invertircadena(cadena);
	        System.out.println("Cadena invertida: " + Cadenainvertida);
	        String cadenaMayusculas = convertirCadena(cadena);
	        System.out.println("Nueva cadena: " + cadenaMayusculas);
	        scanner.close();
	    }

	    public static String LetraMayus(String cadena) {
	        return cadena.substring(0,1).toUpperCase() + cadena.substring(1);
	    }
			
	    public static String Invertircadena(String cadena) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = cadena.length() - 1; i >= 0; i--) {
	            sb.append(cadena.charAt(i));
	        }
	        return sb.toString();
	    }
	  
	    public static String convertirCadena(String cadena) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < cadena.length(); i++) {
	            char x = cadena.charAt(i);
	            if (Vocal(x)) {
	                sb.append(Character.toUpperCase(x));
	            } else {
	                sb.append(x);
	            }
	        }
	        return sb.toString();
	    }

	    public static boolean Vocal(char x) {
	        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ||
	               x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U';
	    

		}

	}
	 