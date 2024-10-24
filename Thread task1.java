package org.example;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFilePath = "C:\\Users\\student\\IdeaProjects\\untitled7\\src\\main\\java\\org\\example\\input.txt";
        String outputFilePath = "C:\\Users\\student\\IdeaProjects\\untitled7\\src\\main\\java\\org\\example\\output.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String upperCaseLine = line.toUpperCase();
                writer.write(upperCaseLine);
                writer.newLine();
            }

            System.out.println("Файл успешно преобразован и записан в " + outputFilePath);

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}
