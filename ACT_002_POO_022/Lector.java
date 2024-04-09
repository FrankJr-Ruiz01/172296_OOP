package actividad;

public class Lector {
    public static void main(String[] args) {
        Lector miLectorExamen = new Lector();
        miLectorExamen.ejecutar(172296); // Cambia el número ID según sea necesario
        
    }

    public void ejecutar(int id) {
        String filePath = "D:\\Users\\172296\\Documents\\CSV_172296\\ACT_002_emails"; // Ruta del archivo CSV
        int startRow = id % 1000; // Últimos tres dígitos del número de ID
        int rowCount = 50; // Número de filas a procesar
        int wordCount = 3000; // Número de palabras

        // Procesar el archivo CSV y calcular la suma de las frecuencias de palabras
        Lector.processCSVFile(filePath, startRow, rowCount, wordCount);
        System.out.println("Suma de frecuencias de palabras guardada en " + id + ".txt");
    }

	private static void processCSVFile(String filePath, int startRow, int rowCount, int wordCount) {
		// TODO Auto-generated method stub
		
	}
}

