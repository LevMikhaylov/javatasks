package com.company;

public class BruteForceDecrypter {
    private static void bruteForceDecrypt(String encryptedText) {
        CaesarDecrypter cs =new CaesarDecrypter();
        for (int i = 1; i <= 25; i++) {
            String decryptedText = cs.decrypt(encryptedText, i);
            System.out.println("Ключ " + i + ": " + decryptedText);
        }
    }
}
