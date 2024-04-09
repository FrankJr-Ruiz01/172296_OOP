package actividad;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConjuntodeDatos {

    public static void processCSVFile(String filePath, int startRow, int rowCount, int wordCount, int id) {
        List<String> words = new ArrayList<>(wordCount);
        List<Double> ConjuntodeDatos = new ArrayList<>(wordCount);
        for (int i = 0; i < wordCount; i++) {
            words.add("");
            ConjuntodeDatos.add(0.0);
         
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int rowNum = 0;

            // Saltar las primeras filas hasta el inicio especificado
            while (rowNum < startRow) {
                br.readLine();
                rowNum++;
            }

            // Procesar las siguientes filas y actualizar las sumas de las frecuencias de palabras
            while ((line = br.readLine()) != null && rowNum < startRow + rowCount) {
                String[] parts = line.split(",");
                for (int i = 1; i < parts.length - 1; i++) {
                    String word = "the_" + i; // Asignar un nombre de palabra para la columna actual
                    double frequency = Double.parseDouble(parts[i]);
                    words.set(i - 1, word);
                    ConjuntodeDatos.set(i - 1, ConjuntodeDatos.get(i - 1) + frequency);
                }
                rowNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Escribir las sumas de las frecuencias en un archivo
        writeToFile(words, ConjuntodeDatos, id);
    }

    public static void writeToFile(List<String> words, List<Double> values, int id) {
        try (FileWriter writer = new FileWriter(id + ".txt")) {
            for (int i = 0; i < words.size(); i++) {
                String line = words.get(i) + ", " + values.get(i);
                writer.write(line);
                writer.write(System.lineSeparator());
            }
            System.out.println("Suma de frecuencias de palabras guardada en " + id + ".txt");
        } 
        catch (IOException e) {
            e.printStackTrace();
            String filePath = "D:\\Users\\172296\\Documents\\CSV_172296\\ACT_002_emails";
            File file = new File(filePath);
            String path = file.getPath();
            System.out.println(path);
        }
    }
}
