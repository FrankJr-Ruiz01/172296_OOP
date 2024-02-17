package pilas_colas;

public class Main_pilas_colas {

		public static void main(String[] args) {
			
			System.out.println("Stack:");
			
			E4 stack = new E4(5);

	        stack.push(1);
	        stack.push(9);
	        stack.push(2);

	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.pop();
	        
			System.out.println(" ");
			
			System.out.println("Queue:");
			E3 queue = new E3(5);
	        queue.enqueue(9);
	        queue.enqueue(4);
	        queue.enqueue(5);

	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue();
	        
			System.out.println(" ");
			
			System.out.println("Reverse:");
			String str = "ReverseStack";

	        str = E5.reverse(str);
	        System.out.println("La palabra invertida es:" + str);
	        
			System.out.println(" ");
			
			System.out.println("Palindromo:");

	        String palindromo = "reconocer";
	        String noPalindromo = "hola";

	        System.out.println(palindromo + " es palíndromo: " + E6.esPalindromo(palindromo));
	        System.out.println(noPalindromo + " es palíndromo: " + E6.esPalindromo(noPalindromo));

	    }
	}

