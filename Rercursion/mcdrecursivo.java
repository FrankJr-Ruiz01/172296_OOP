package Practicas;

import java.util.Scanner;

public class mcdrecursivo {
	
	public static int MCDrecursivo(int a, int b) {
		
		if(b==0) {
			return a;
			
		}else{
			return MCDrecursivo(b,a%b);
		}
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int a,b;
		System.out.println("Ingrese un valor a: ");
		a=leer.nextInt();
		System.out.println("Ingrese un valor b: ");
		b=leer.nextInt();
		
		System.out.println("El MCD de " +a+ " y " +b+ " es: "+MCDrecursivo(a,b));
	}

}
