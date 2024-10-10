package ru.ithub.javatrainj;
public class KeyValidator {
    public static boolean checkkey(int key){
        return key < 1 || key > 33;
    }
}
