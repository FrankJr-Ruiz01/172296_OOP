package pilas_colas;

	import java.util.Stack;

	public class E6 {
		
	    public static boolean esPalindromo(String str) {
	        if (str == null || str.isEmpty()) {
	            return false;
	        }

	        Stack<Character> stack = new Stack<>();
	        int length = str.length();
	        int middle = length / 2;

	        for (int i = 0; i < middle; i++) {
	            stack.push(str.charAt(i));
	        }
	        int startIndex = middle + (length % 2);
	        for (int i = startIndex; i < length; i++) {
	            char currentChar = str.charAt(i);
	            if (!stack.isEmpty() && currentChar == stack.pop()) {
	                continue;
	            } else {
	                return false;
	            }
	        }
	        return true;
	    }
	}

