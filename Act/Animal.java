package Pilares;

public abstract class Animal {
	private int numeroPatas;
    private String color;

    public Animal(int numeroPatas, String color) {
        this.numeroPatas = numeroPatas;
        this.color = color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}