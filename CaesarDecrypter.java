package ru.ithub.javatrainj;


public class CaesarDecrypter {
    public static String decrypt(String text, int key) {
        CaesarEncrypter сe = new CaesarEncrypter();
        return сe.encrypt(text, 26 - key);
    }
}
