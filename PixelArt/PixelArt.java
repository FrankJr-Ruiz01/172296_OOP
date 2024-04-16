package ImageIO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelArt {
    static int width = 800;
    static int height = 800;
    
    static Color softCyan = new Color(0x5EDFF9);
    static Color darkCyan = new Color(0x3495CD);
    static Color softBlue = new Color(0x2951B0);
    static Color darkBlue = new Color(0x1E3978);
    static Color softOrange = new Color(0xF17D30);
    static Color darkOrange = new Color(0xBD4423);
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
        drawHorizontalLine(5, 12, 1, Color.black);
        drawHorizontalLine(5, 15, 2, Color.black);
        drawHorizontalLine(5, 18, 3, Color.black);
        drawHorizontalLine(3, 17, 4, Color.black);
        drawHorizontalLine(3, 16, 5, Color.black);
        drawHorizontalLine(2, 17, 6, Color.black);
        drawHorizontalLine(2, 17, 7, Color.black);
        drawHorizontalLine(3, 17, 8, Color.black);
        drawHorizontalLine(4, 17, 9, Color.black);
        drawHorizontalLine(5, 14, 10, Color.black);
        drawHorizontalLine(6, 15, 11, Color.black);
        drawHorizontalLine(7, 18, 12, Color.black);
        drawHorizontalLine(7, 18, 13, Color.black);
        drawHorizontalLine(6, 17, 14, Color.black);
        drawHorizontalLine(5, 16, 15, Color.black);
        drawHorizontalLine(5, 15, 16, Color.black);
        drawHorizontalLine(5, 15, 17, Color.black);
        
        fillRect(12, 2, 1, 1, softCyan);
        fillRect(6, 3, 1, 1, softCyan);
        fillRect(8, 4, 1, 1, softCyan);
        fillRect(10, 4, 1, 1, softCyan);
        fillRect(13, 4, 1, 1, softCyan);
        fillRect(16, 7, 1, 1, softCyan);        
        drawHorizontalLine(6, 9, 2, softCyan);
        drawHorizontalLine(9, 10, 3, softCyan); 
        drawHorizontalLine(12, 13, 3, softCyan); 
        drawHorizontalLine(14, 15, 5, softCyan);
        drawHorizontalLine(8, 9, 5, softCyan);
        drawHorizontalLine(15, 16, 6, softCyan);
        drawVerticalLine(5, 6, 12, softCyan);
        drawVerticalLine(6, 7, 11, softCyan);
        
        fillRect(15, 3, 1, 1, darkCyan);
        fillRect(16, 4, 1, 1, darkCyan);
        fillRect(6, 4, 1, 1, darkCyan);
        fillRect(6, 6, 1, 1, darkCyan);
        fillRect(8, 6, 1, 1, darkCyan);
        fillRect(10, 6, 1, 1, darkCyan);
        fillRect(7, 7, 1, 1, darkCyan);
        fillRect(9, 7, 1, 1, darkCyan);
        drawHorizontalLine(11, 12, 4, darkCyan);
        drawHorizontalLine(10, 11, 5, darkCyan);
        fillRect(13, 5, 1, 1, darkCyan);
        fillRect(10, 1, 1, 1, Color.white);
        fillRect(14, 2, 1, 1, Color.white);
        fillRect(16, 9, 1, 1, Color.white);
        drawHorizontalLine(10, 11, 16, Color.white);
        drawHorizontalLine(8, 12, 17, Color.white);
        
        drawHorizontalLine(8, 9, 12, softOrange);
        drawHorizontalLine(12, 14, 14, softOrange);
        fillRect(7, 14, 2, 2, softOrange);
        putPixel(14,15,softOrange);
        
        putPixel(6,15,darkOrange);
        putPixel(9,14,darkOrange);
        putPixel(10,13,darkOrange);
        putPixel(8,11,darkOrange);
        drawHorizontalLine(12, 13, 15, darkOrange);
        
        drawHorizontalLine(4, 5, 7, softBlue); 
        drawHorizontalLine(11, 12, 14, softBlue); 
        drawHorizontalLine(6, 7, 16, softBlue); 
        drawHorizontalLine(13, 14, 16, softBlue);
        putPixel(4,8,softBlue);
        
        drawVerticalLine(10, 11, 7, darkBlue);
        drawVerticalLine(12, 13, 15, darkBlue);
        putPixel(9,13,darkBlue);
        putPixel(10,14,darkBlue);
        putPixel(6,16,darkBlue);
        
        drawVerticalLine(5, 6, 4, softSkin);
        drawVerticalLine(8, 9, 5, softSkin);
        drawVerticalLine(8, 9, 8, softSkin);
        drawVerticalLine(9, 11, 10, softSkin);
        drawVerticalLine(11, 12, 11, softSkin);
        fillRect(12, 11, 1, 1, softSkin);
        drawHorizontalLine(16, 17, 13, softSkin);
        
        drawVerticalLine(7, 8, 14, Skin);
        drawVerticalLine(9, 10, 6, Skin);
        drawVerticalLine(9, 10, 9, Skin);
        drawVerticalLine(7, 11, 13, Skin);
        putPixel(12,8,Skin);
        putPixel(12,10,Skin);
        putPixel(12,12,Skin);
        putPixel(14,12,Skin);
        putPixel(3,6,Skin);
        putPixel(10,8,Skin);
        putPixel(16,14,Skin);
        
        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art.jpg"));
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