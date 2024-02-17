package pilas_colas;

public class E4 {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public E4(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Elemento " + value + " agregado al stack.");
        } else {
            System.out.println("El stack está lleno. No se puede agregar más elementos.");
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedElement = stackArray[top--];
            System.out.println("Elemento " + poppedElement + " retirado del stack.");
            return poppedElement;
        } else {
            System.out.println("El stack está vacío. No hay elementos para retirar.");
            return -1;
        }
    }
}
