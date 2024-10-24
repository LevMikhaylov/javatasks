package org.example;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
public class Main {
    static String INPUT_FILE = "C:\\Users\\student\\IdeaProjects\\untitled7\\src\\main\\java\\org\\example\\large_input.txt";
    static String OUTPUT_FILE_IO = "C:\\Users\\student\\IdeaProjects\\untitled7\\src\\main\\java\\org\\example\\output_io.txt";
    static String OUTPUT_FILE_NIO = "C:\\Users\\student\\IdeaProjects\\untitled7\\src\\main\\java\\org\\example\\output_nio.txt";
    static long readAndWriteUsingIO() {
        long startTime = System.currentTimeMillis();
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));
             BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE_IO))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long readAndWriteUsingNIO() {
        long startTime = System.currentTimeMillis();
        try (FileChannel fileChannel = FileChannel.open(Path.of(INPUT_FILE), StandardOpenOption.READ);
             FileChannel outputChannel = FileChannel.open(Path.of(OUTPUT_FILE_NIO), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {

            ByteBuffer buffer = ByteBuffer.allocate(1024); // Аллоцируем буфер
            while (fileChannel.read(buffer) > 0) {
                buffer.flip(); // Переключаемся на режим чтения
                outputChannel.write(buffer); // Записываем данные
                buffer.clear(); // Очищаем буфер для повторного использования
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }
    public static void main(String[] args){
        long ioTime = readAndWriteUsingIO();
        long nioTime = readAndWriteUsingNIO();

        System.out.println("Время чтения и записи файла с использованием IO: " + ioTime + " мс");
        System.out.println("Время чтения и записи файла с использованием NIO: " + nioTime + " мс");

        if (ioTime < nioTime) {
            System.out.println("Метод IO быстрее.");
        } else if (nioTime < ioTime) {
            System.out.println("Метод NIO быстрее.");
        } else {
            System.out.println("Оба метода работают с одинаковой скоростью.");
        }
    }
}
