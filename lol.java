package ru.ithub.javatrainj;
import java.io.*;
import java.util.Scanner;
public class lol {
    public static String readFile(File file) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public static void writeFile(String fileName, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
        }
    }
    public static void main(String[] args) throws IOException {
        KeyValidator kv = new KeyValidator();
        CaesarEncrypter cs1 = new CaesarEncrypter();
        CaesarDecrypter cd2 = new CaesarDecrypter();
        FileChecker fc = new FileChecker();
        BruteForceDecrypter bf = new BruteForceDecrypter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим работы:");
        System.out.println("1. Шифрование");
        System.out.println("2. Расшифровка");
        int mode = scanner.nextInt();
        scanner.nextLine();
        try {
            switch (mode) {
                case 1:
                    System.out.print("Введите путь к файлу: ");
                    String filePath = scanner.nextLine();
                    File inputFile = new File(filePath);
                    fc.checkFile(inputFile);
                    String content = readFile(inputFile);
                    System.out.print("Введите ключ (число от 1 до 33): ");
                    int key = scanner.nextInt();
                    if(kv.checkkey(key)==true){
                        System.out.println("Ошибка: Неверный ключ.");
                    }
                    String encryptedContent = cs1.encrypt(content, key);
                    writeFile("C:\\Users\\student\\IdeaProjects\\ppppp\\src\\ru\\ithub\\javatrainj\\encrypted.txt", encryptedContent);
                    System.out.println("Текст зашифрован и сохранен в encrypted.txt.");
                    break;
                case 2:
                    System.out.print("Введите путь к файлу: ");
                    String filePath1 = scanner.nextLine();
                    File inputFile1 = new File(filePath1);
                    fc.checkFile(inputFile1);
                    String content1 = readFile(inputFile1);
                    System.out.print("Введите ключ (число от 1 до 33): ");
                    int key1 = scanner.nextInt();
                    if(kv.checkkey(key1)==true){
                        System.out.println("Ошибка: Неверный ключ.");
                    }
                    String decryptedContent = cd2.decrypt(content1, key1);
                    writeFile("C:\\Users\\student\\IdeaProjects\\ppppp\\src\\ru\\ithub\\javatrainj\\decrypted.txt", decryptedContent);
                    System.out.println("Текст расшифрован и сохранен в decrypted.txt.");
                    bf.bruteForceDecrypt("tuv");
                    break;
                default:
                    System.out.println("Ошибка: неверный режим.");
                    break;
            }
        }catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
        scanner.close();
    }
}
