package ru.ithub.javatrainj;

import java.io.File;

public class FileChecker {

    public static void checkFile(File file){
        if (!file.exists() || !file.isFile()) {
            System.out.println("Ошибка: Файл не существует или это не файл.");
        }
    }
}
