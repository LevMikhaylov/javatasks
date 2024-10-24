package org.example;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
public class Main {
    public static void copyFile(String sourcePath, String destinationPath) {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destinationPath);

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile);
             FileChannel sourceChannel = fis.getChannel();
             FileChannel destinationChannel = fos.getChannel()) {

            long position = 0;
            long size = sourceChannel.size();
            long bytesTransferred;

            // Копируем файл с помощью transferTo
            while (position < size) {
                bytesTransferred = sourceChannel.transferTo(position, size - position, destinationChannel);
                position += bytesTransferred;
            }

            System.out.println("Копирование завершено успешно!");

        } catch (IOException e) {
            System.err.println("Произошла ошибка при копировании файла: " + e.getMessage());
        }
    }
    public static void main(String[] args){
        String sourcePath = "C:\\Users\\student\\IdeaProjects\\untitled7\\src\\main\\java\\org\\example\\large_input.txt"; 
        String destinationPath = "C:\\Users\\student\\IdeaProjects\\untitled7\\src\\main\\java\\org\\example\\copied.txt"; 

        copyFile(sourcePath, destinationPath);
    }
}
