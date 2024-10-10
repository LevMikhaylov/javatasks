package ru.ithub.javatrainj;
public class CaesarEncrypter {
    public static String encrypt(String text, int key) {

        StringBuilder encrypted = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) ((character - base + key) % 26 + base);
            }
            encrypted.append(character);
        }
        return encrypted.toString();
    }
}
