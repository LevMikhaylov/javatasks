package ru.ithub.javatrainj;

public class TextShifter {

    private static final String ALPHABET_RUSSIAN = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
    private static final String ALPHABET_ENGLISH = "abcdefghijklmnopqrstuvwxyz";
    private static char shiftCharacter(char c, int key, String alphabet) {
        int alphabetSize = alphabet.length();
        int originalIndex = alphabet.indexOf(Character.toLowerCase(c));
        int newIndex = (originalIndex + key) % alphabetSize;

        if (newIndex < 0) { // Чтобы избежать отрицательных индексов
            newIndex += alphabetSize;
        }

        char newChar = alphabet.charAt(newIndex);

        return Character.isUpperCase(c) ? Character.toUpperCase(newChar) : newChar;
    }
    public static String shiftText(String text, int key) {
        StringBuilder shifted = new StringBuilder();

        for (char c : text.toCharArray()) {
            char shiftedChar = c;

            if (Character.isLetter(c)) {
                if (ALPHABET_RUSSIAN.indexOf(Character.toLowerCase(c)) >= 0) {
                    shiftedChar = shiftCharacter(c, key, ALPHABET_RUSSIAN);
                } else if (ALPHABET_ENGLISH.indexOf(Character.toLowerCase(c)) >= 0) {
                    shiftedChar = shiftCharacter(c, key, ALPHABET_ENGLISH);
                }
            }

            shifted.append(shiftedChar);
        }

        return shifted.toString();
    }
}
