package ImageIO;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelArt4 {
    static int width = 800;
    static int height = 800;
    
    static Color Blue = new Color(0x0D0992);
    static Color Yellow = new Color(0xF6CE4C);
    static Color Red = new Color(0xE02526);
    static Color Brown = new Color(0x653D1B);
    static Color Black = new Color(0x000000);
    
    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaÃ±o del pixel y la matriz de colores
    private final static int PIXEL_SIZE = 40;
    private final static Color[][] PIXELS = {
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
    };
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);
    	drawHorizontalLine(8, 12, 1, Red);
    	drawHorizontalLine(7, 15, 2, Red);
    	drawHorizontalLine(7, 13, 3, Yellow);
    	drawHorizontalLine(6, 15, 4, Yellow);
    	drawHorizontalLine(6, 16, 5, Yellow);
    	drawHorizontalLine(7, 15, 6, Yellow);
    	drawHorizontalLine(8, 13, 7, Yellow);
    	drawHorizontalLine(7, 14, 8, Red);
    	drawHorizontalLine(6, 15, 9, Red);
    	drawHorizontalLine(5, 16, 10, Red);
    	drawHorizontalLine(5, 16, 11, Blue);	    
        drawHorizontalLine(5, 16, 12, Blue);
        drawHorizontalLine(5, 16, 13, Blue);
        drawHorizontalLine(7, 14, 14, Blue);
        drawHorizontalLine(6, 15, 15, Brown);
        drawHorizontalLine(5, 16, 16, Brown);
        
        
       
   
        putPixel(7,12,Yellow);
        putPixel(14,12,Yellow);
        putPixel(9,11,Yellow);
        putPixel(12,11,Yellow);
        fillRect(5, 11, 2, 3, Yellow);
        fillRect(15, 11, 2, 3, Yellow);
        putPixel(7,11,Red);
        putPixel(14,11,Red);
        drawHorizontalLine(9, 12, 10, Blue);
        drawVerticalLine(8, 9, 9, Blue);
        drawVerticalLine(8, 9, 12, Blue);
        drawVerticalLine(3, 4, 12, Black);
        drawHorizontalLine(12, 15, 6, Black);
        putPixel(13,5,Black);
        drawHorizontalLine(7, 9, 3, Brown);
        putPixel(8,4,Brown);
        drawHorizontalLine(8, 9, 5, Brown);
        drawVerticalLine(4, 5, 6, Brown);
        putPixel(7,6,Brown);
   
        
        
        drawHorizontalLine(10, 11, 14, Color.white);
        fillRect(9, 15, 4, 2, Color.white);
        
        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art4.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }
    
    
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}
