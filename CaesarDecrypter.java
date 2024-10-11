package ru.ithub.javatrainj;


public class CaesarDecrypter {
     public static String decrypt(String text, int key) {
        TextShifter ts = new TextShifter();
        return ts.shiftText(text, -key);
    }
}
