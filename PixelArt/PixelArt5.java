package ImageIO;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelArt5 {
    static int width = 800;
    static int height = 800;
    
    static Color softYellow = new Color(0xFEFAAB);
    static Color Yellow = new Color(0xF8D24F);
    static Color softSkin = new Color(0xF9CAA3);
    static Color Skin = new Color(0xD28A65);
    static Color RedScar = new Color(0xBA544D);
    static Color softOrange = new Color(0xF49831);
    static Color Orange = new Color(0xB15921);
    static Color softBlue= new Color(0x5477DA);
    static Color Blue = new Color(0x253E7C);
    static Color Gray = new Color(0xADADA2);
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
        drawHorizontalLine(6, 13, 1, Color.black);
        drawHorizontalLine(6, 14, 2, Color.black);
        drawHorizontalLine(6, 17, 3, Color.black);
        drawHorizontalLine(4, 16, 4, Color.black);
        drawHorizontalLine(5, 15, 5, Color.black);
        drawHorizontalLine(4, 16, 6, Color.black);
        drawHorizontalLine(5, 16, 7, Color.black);
        drawHorizontalLine(5, 16, 8, Color.black);
        drawHorizontalLine(6, 16, 9, Color.black);
        drawHorizontalLine(5, 14, 10, Color.black);
        drawHorizontalLine(4, 13, 11, Color.black);
        drawHorizontalLine(3, 14, 12, Color.black);
        drawHorizontalLine(3, 14, 13, Color.black);
        drawHorizontalLine(4, 14, 14, Color.black);
        drawHorizontalLine(6, 14, 15, Color.black);
        drawHorizontalLine(5, 14, 16, Color.black);
        drawHorizontalLine(4, 15, 17, Color.black);
        drawHorizontalLine(4, 15, 18, Color.black);
        
        drawHorizontalLine(9, 10, 2, softYellow);
        drawHorizontalLine(7, 8, 3, softYellow);
        drawHorizontalLine(10, 11, 3, softYellow);
        drawHorizontalLine(8, 9, 4, softYellow);
        drawHorizontalLine(11, 12, 5, softYellow);
        drawHorizontalLine(10, 11, 6, softYellow);
        drawHorizontalLine(14, 15, 6, softYellow);
        drawVerticalLine(2, 4, 13, softYellow);
        drawVerticalLine(6, 7, 15, softYellow);
        drawVerticalLine(6, 7, 10, softYellow);
        drawVerticalLine(6, 7, 8, softYellow);

        drawHorizontalLine(6, 9, 5, Yellow);
        drawHorizontalLine(5, 7, 6, Yellow);
        drawHorizontalLine(10, 12, 4, Yellow);
        drawHorizontalLine(13, 14, 5, Yellow);
        drawHorizontalLine(14, 15, 4, Yellow);
        putPixel(14, 3, Yellow);
        putPixel(6, 7, Yellow);
        
        drawVerticalLine(8, 9, 7, softSkin);
        drawVerticalLine(8, 10, 9, softSkin);
        drawVerticalLine(7, 8, 13, softSkin);
        drawVerticalLine(12, 13, 4, softSkin);
        drawVerticalLine(12, 13, 6, softSkin);
        drawHorizontalLine(6, 8, 12, softSkin);    
        putPixel(12, 7, softSkin);
        putPixel(11, 10, softSkin);
        putPixel(12, 11, softSkin);
        
        drawVerticalLine(9, 10, 8, Skin);
        drawVerticalLine(8, 10, 12, Skin);
        putPixel(13, 9, Skin);
        putPixel(7, 13, Skin);
        
        putPixel(11, 8, RedScar);
        putPixel(9, 11, RedScar);
        
        putPixel(6, 10, softOrange);
        putPixel(9, 13, softOrange);
        drawHorizontalLine(7, 8, 15, softOrange);
        drawHorizontalLine(6, 7, 16, softOrange);
        
        drawHorizontalLine(12, 13, 16, Orange);
        putPixel(12, 15, Orange);
        putPixel(12, 13, Orange);
        putPixel(13, 12, Orange);
        putPixel(8, 16, Orange); 
        putPixel(10, 15, Orange);
        putPixel(7, 11, Orange);
        
        drawVerticalLine(15, 16, 9, softBlue);
        drawVerticalLine(15, 16, 11, softBlue);
        drawVerticalLine(12, 13, 5, softBlue);
        drawHorizontalLine(5, 6, 17, softBlue);
        putPixel(8, 14, softBlue);
        putPixel(10, 14, softBlue);
        
        drawVerticalLine(13, 14, 13, Blue);
        drawHorizontalLine(13, 14, 17, Blue);
        drawHorizontalLine(5, 6, 11, Blue);
        putPixel(9, 14, Blue);
        putPixel(11, 14, Blue);
                    
        drawHorizontalLine(9, 10, 17, Color.white);
        drawHorizontalLine(7, 12, 18, Color.white);
        fillRect(15, 9, 1, 1, Color.white);
        putPixel(7, 1, Color.white);
        putPixel(11, 1, Color.white);
        fillRect(10, 11, 2, 2, Color.white);
        putPixel(10, 11, Gray);
        
        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art5.jpg"));
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
