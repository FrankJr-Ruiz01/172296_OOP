package Practicas;

import java.util.Scanner;

public class potenciarecursiva {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese un numero base: ");
		long base= teclado.nextLong();
		System.out.println("Ingrese un exponencial: ");
		long exponente= teclado.nextLong();
		
		System.out.println("El resultado es: "+ potencia(base,exponente));
	}
	
	public static long potencia(long base, long exponente) {
		if(exponente==0) {
			return 1;
		}
		return base * potencia(base,exponente -1);
	}

}
