package ru.ithub.javatrainj;

public class VigenereDecrypyer {
    public static String decrypt(String ciphertext, String key) {
        VigenereEncrypter ve = new VigenereEncrypter();
        return ve.process(ciphertext, key, false);
    }
}
