package Pilares;

public class Mamifero extends Animal {
    public Mamifero(int numeroPatas, String color) {
        super(numeroPatas, color);
    }

    @Override
    public String toString() {
        return "Mamifero";
    }
}