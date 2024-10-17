package ru.ithub.javatrainj;

public class VigenereEncrypter {
    private static final String ALPHABET_ENGLISH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHABET_RUSSIAN = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static String process(String text, String key, boolean isEncrypt) {
        StringBuilder result = new StringBuilder();
        String alphabet = isEnglish(text) ? ALPHABET_ENGLISH : ALPHABET_RUSSIAN;
        int keyLength = key.length();
        int keyIndex = 0;

        for (char character : text.toCharArray()) {
            char c = Character.toUpperCase(character);
            if (alphabet.indexOf(c) != -1) {
                int shift = alphabet.indexOf(Character.toUpperCase(key.charAt(keyIndex % keyLength)));
                int newIndex = isEncrypt
                        ? (alphabet.indexOf(c) + shift) % alphabet.length()
                        : (alphabet.indexOf(c) - shift + alphabet.length()) % alphabet.length();
                result.append(alphabet.charAt(newIndex));
                keyIndex++;
            } else {
                result.append(character); // Сохраняем символ
            }
        }
        return result.toString();
    }
    private static boolean isEnglish(String text) {
        return text.chars().allMatch(c -> (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || !Character.isLetter(c));
    }
    public static String encrypt(String plaintext, String key) {
        return process(plaintext, key, true);
    }
}
