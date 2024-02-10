package Practicas;

public class fibonacci {
	public static int fib(int n) {
		if (n<=1)
			return n;
		else 
			return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		int n=8;
		if(n<0)
			System.out.println("El numero no esta definido");
		else
			System.out.println(fib(n));
	}
}
