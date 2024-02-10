package Practicas;

public class buscarelementArray {
	
public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5};
		int elementoBuscar=3;
		int posElementoEncontrado=posicionElementoRecursivo(array,elementoBuscar,0);
		System.out.println(posElementoEncontrado);
	}
	
	public static int posicionElementoRecursivo(int[] array, int elementoBuscar, int index) {
		
		if(index!=array.length || array[index]==elementoBuscar) {
			
			if(index==array.length) {
				return-1;
			}else{
				return index;
			}
		}else {
			return posicionElementoRecursivo(array, elementoBuscar,index+1);
		}
	}

}
