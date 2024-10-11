package ru.ithub.javatrainj;
public class CaesarEncrypter {
     public static String encrypt(String text, int key) {
        TextShifter ts = new TextShifter();
        return ts.shiftText(text, key);
    }
}
