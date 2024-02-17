package pilas_colas;

public class E3 {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public E3(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear < maxSize - 1) {
            queueArray[++rear] = value;
            System.out.println("Elemento " + value + " añadido al final de la cola.");
        } else {
            System.out.println("La cola está llena. No se pueden añadir más elementos.");
        }
    }

    public int dequeue() {
        if (front <= rear) {
            int deqElement = queueArray[front++];
            System.out.println("Elemento " + deqElement + " retirado del frente de la cola.");
            return deqElement;
        } else {
            System.out.println("La cola está vacía. No hay elementos para retirar.");
            return -1;
        }
    }
}


