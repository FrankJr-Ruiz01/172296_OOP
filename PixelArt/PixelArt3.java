package ImageIO;

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Canvas;
	import java.awt.Frame;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import javax.imageio.ImageIO;

	public class PixelArt3 {
	    static int width = 800;
	    static int height = 800;
	    
	    static Color softGray = new Color(0xC0C0C0);
	    static Color Gray = new Color(0x808080);
	    static Color darkGray = new Color(0x474747);
	    static Color Black = new Color(0x000000);
	    static Color softBlue = new Color(0x42659C);
	    static Color darkBlue = new Color(0x253475);
	    
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
	    	drawHorizontalLine(3, 8, 4, Color.black);
	    	drawHorizontalLine(2, 9, 5, Color.black);
	    	drawHorizontalLine(2, 9, 6, Color.black);
	    	drawHorizontalLine(2, 9, 7, Color.black);
	    	drawHorizontalLine(1, 10, 8, Color.black);
	    	drawHorizontalLine(1, 10, 9, Color.black);
	    	drawHorizontalLine(1, 10, 10, Color.black);
	    	drawHorizontalLine(1, 10, 11, Color.black);
	    	drawHorizontalLine(1, 10, 11, Color.black);
	    	drawHorizontalLine(1, 11, 12, Color.black);
	    	drawHorizontalLine(2, 11, 13, Color.black);	    
	        drawHorizontalLine(3, 10, 14, Color.black);
	        drawHorizontalLine(2, 9, 15, Color.black);
	        drawHorizontalLine(2, 9, 16, Color.black);
	        drawHorizontalLine(3, 9, 17, Color.black);
	        drawHorizontalLine(4, 7, 18, Color.black);
	        
	        
	       
	        drawVerticalLine(8, 9, 1, darkGray);
	        drawVerticalLine(4, 6, 7, darkGray);
	        fillRect(1, 12, 1, 1, darkGray);
	        putPixel(2,5,darkGray);
	        putPixel(3,4,darkGray);
	        putPixel(2,13,darkGray);
	        putPixel(9,14,Gray);
	        putPixel(10,13,softGray);
	        putPixel(8,8,softGray);
	        fillRect(7, 11, 2, 2, softGray);
	        drawVerticalLine(9, 11, 9, softGray);
	        drawVerticalLine(5, 7, 3, softGray);
	        
	        fillRect(5, 4, 2, 3, Color.white);
	        fillRect(2, 8, 6, 2, Color.white);
	        fillRect(7, 9, 2, 2, Color.white);
	        fillRect(3, 10, 2, 2, Color.white);
	        drawVerticalLine(5, 7, 8, Color.white);
	        putPixel(7,11,Color.white);
	        drawHorizontalLine(2, 6, 12, Color.white);
	        drawHorizontalLine(5, 6, 18, Color.white);
	        
	        putPixel(5,14,softBlue);
	        putPixel(6,15,softBlue);
	        putPixel(7,14,softBlue);
	        putPixel(4,14,darkBlue);
	        putPixel(5,15,darkBlue);
	        putPixel(6,14,darkBlue);
	        drawVerticalLine(15, 16, 3, softBlue);
	        drawHorizontalLine(7, 8, 15, darkBlue);
	        drawHorizontalLine(7, 8, 16, softBlue);
	        
	        drawSquareGrid(PIXEL_SIZE, Color.black);
	        // Guardamos la imagen en formato JPG
	        try {       
	            ImageIO.write(image, "jpg", new File("pixel_art3.jpg"));
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

