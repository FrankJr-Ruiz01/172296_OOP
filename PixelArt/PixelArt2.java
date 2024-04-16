package ImageIO;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelArt2 {
    static int width = 800;
    static int height = 800;
    
    static Color softPink = new Color(0xF4BAD7);
    static Color Pink = new Color(0xED5A94);
    static Color darkPink = new Color(0xE453B5);
    static Color Lila = new Color(0xD3A3B5);
    static Color Green = new Color(0x62B529);
    static Color Gray = new Color(0xC3B3C0);
    static Color softPurple = new Color(0x927185);
    static Color Purple = new Color(0x614A5E);
    static Color darkPurple = new Color(0x3F343F);
    static Color Red= new Color(0xdb402b);
    static Color softSkin = new Color(0xFBDCBB);
    static Color Skin = new Color(0xF5A673);
    static Color Black = new Color(0x000000);

    
    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaÃ±o del pixel y la matriz de colores
    private final static int PIXEL_SIZE = 40;
    private final static Color[][] PIXELS = {
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.ORANGE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
    };
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);     
        drawHorizontalLine(4, 11, 1, Color.black);
        drawHorizontalLine(4, 14, 2, Color.black);
        drawHorizontalLine(4, 17, 3, Color.black);
        drawHorizontalLine(3, 16, 4, Color.black);
        drawHorizontalLine(3, 15, 5, Color.black);
        drawHorizontalLine(3, 16, 6, Color.black);
        drawHorizontalLine(4, 16, 7, Color.black);
        drawHorizontalLine(3, 16, 8, Color.black);
        drawHorizontalLine(2, 16, 9, Color.black);
        drawHorizontalLine(2, 13, 10, Color.black);
        drawHorizontalLine(3, 13, 11, Color.black);
        drawHorizontalLine(5, 17, 12, Color.black);
        drawHorizontalLine(7, 17, 13, Color.black);
        drawHorizontalLine(7, 16, 14, Color.black);
        drawHorizontalLine(6, 15, 15, Color.black);
        drawHorizontalLine(6, 14, 16, Color.black);
        drawHorizontalLine(7, 13, 17, Color.black);
        drawHorizontalLine(7, 9, 18, Color.black);
        
        drawHorizontalLine(6, 8, 2, softPink);
        drawHorizontalLine(8, 9, 3, softPink);
        putPixel(9,4,softPink);
        putPixel(4,5,softPink);
        putPixel(11,2,softPink);
        drawHorizontalLine(4, 5, 6, softPink);
        fillRect(7, 5, 2, 2, softPink);
        fillRect(11, 3, 2, 2, softPink);
        putPixel(12,5,softPink);
        putPixel(7,4,softPink);
        putPixel(8,7,softPink);
        drawHorizontalLine(5, 6, 7, softPink);
        drawHorizontalLine(10, 11, 6, softPink);
        drawHorizontalLine(14, 15, 6, softPink);
        putPixel(10,7,softPink);
        putPixel(15,7,softPink);
        
        drawVerticalLine(2, 4, 5, Pink);
        drawHorizontalLine(5, 7, 3, Pink);
        putPixel(8,4,Pink);
        putPixel(10,4,Pink);
        putPixel(9,6,Pink);
        drawHorizontalLine(9, 11, 5, Pink);
        putPixel(14,3,Pink);
        putPixel(15,4,Pink);
        drawHorizontalLine(13, 14, 5, Pink);
        drawHorizontalLine(4, 5, 8, Pink);
        
        //blade
        drawHorizontalLine(4, 6, 9, softPink);
        drawHorizontalLine(7, 8, 10, softPink);
        putPixel(9,11,softPink);
        drawHorizontalLine(6, 10, 12, softPink);
        drawHorizontalLine(4, 5, 11, softPink);
        putPixel(3,10,softPink);
        drawHorizontalLine(4, 6, 10, darkPink);
        drawHorizontalLine(6, 8, 11, darkPink);
    
        
        fillRect(9, 1, 1, 1, Color.white);
        fillRect(13, 2, 1, 1, Color.white);
        fillRect(15, 9, 1, 1, Color.white);
        fillRect(15, 12, 1, 1, Color.white);
        drawHorizontalLine(8, 9, 17, Color.white);
                              
        putPixel(9,13,Gray);
        putPixel(8,13,softPurple);
        putPixel(8,15,softPurple);
        putPixel(3,9,Purple);
        putPixel(7,15,Purple);
        drawHorizontalLine(7, 8, 16, Purple);
        fillRect(12, 14, 2, 2, Purple);
        putPixel(12,16,Lila);
        putPixel(13,12,darkPurple);
        putPixel(14,13,darkPurple);
        putPixel(12,15,darkPurple);
        putPixel(9,16,darkPurple);
        drawHorizontalLine(8, 11, 14, Red);
        drawHorizontalLine(9, 11, 15, Gray);
        
        drawHorizontalLine(16, 16, 13, softSkin);
        drawVerticalLine(8, 9, 9, softSkin);
        putPixel(7,8,softSkin);
        putPixel(15,14,softSkin);
        fillRect(12, 7, 2, 2, softSkin);
        putPixel(11,8,softSkin);
        
        
       
        putPixel(8,9,Skin);
        putPixel(9,10,Skin);
        putPixel(12,8,Skin);
        putPixel(10,11,Skin);
        putPixel(11,12,Skin);
        drawHorizontalLine(12, 13, 9, Skin);
        putPixel(7,9,Green);
        fillRect(11, 10, 2, 2, Skin);
        
        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art2.jpg"));
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


