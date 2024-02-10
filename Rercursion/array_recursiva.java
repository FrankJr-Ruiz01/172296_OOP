package Practicas;

public class array_recursiva {
	
	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6,7,8,9};
		mostrarArray(array,0);
	}
	
	public static void mostrarArray(int[] array, int index) {
		if(index!=array.length) {
			System.out.println(array[index]);
			mostrarArray(array, index+1);
		}
	}

}

