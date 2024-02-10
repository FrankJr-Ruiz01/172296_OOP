package Practicas;

import java.util.Scanner;

public class sumadigitos {
	
	public static int sumarDigitos(int num) {
		if(num<10) {
			return num;
		}else {
			return (num % 10) + sumarDigitos(num/10);
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		int num;
		
		System.out.println("Digite un numero: ");
		num=teclado.nextInt();
		
		int suma_digitos=sumarDigitos(num);
		System.out.println("La suma de los digitos es: " + suma_digitos);
	}

}
