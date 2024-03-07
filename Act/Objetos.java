package Pilares;
import java.util.Random;
public class Objetos {

	public class Main {
	    public static void main(String[] args) {
	        Random random = new Random();
	        Animal[] animales = new Animal[10];
	        for (int i = 0; i < 10; i++) {
	            int tipo = random.nextInt(3); 
	            switch (tipo) {
	                case 0:
	                    animales[i] = new Mamifero(4, "Marrón");
	                    break;
	                case 1:
	                    animales[i] = new Pez(0, "Plateado");
	                    break;
	                case 2:
	                    animales[i] = new Ave(2, "Azul");
	                    break;
	            }
	        }
	        int indiceAleatorio = random.nextInt(10);
	        Animal animalAleatorio = animales[indiceAleatorio];

	        if (animalAleatorio != null) {
	            System.out.println("Animal Aleatorio:" + animalAleatorio);
	            System.out.println("Número de patas: " + animalAleatorio.getNumeroPatas());
	            System.out.println("Color: " + animalAleatorio.getColor());
	        } else {
	            System.out.println("No hay animal en la posición aleatoria");
	        }
	    }
	}}