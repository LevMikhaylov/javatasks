package com.company;
import java.util.Scanner;
public class WeakPasswordException extends Exception{
    public WeakPasswordException(String message){
        super(message);
    }
}
public class Main {
    public static void checkPassword(String p) throws WeakPasswordException{
        if(p.length()<8){
            throw new WeakPasswordException("Пароль слабый!");
        }
        else{
            System.out.println("Пароль сильный");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Проверка пароля");
        try {
            System.out.println("Введите пароль");
            String password = sc.next();
            checkPassword(password);
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());;
        }
    }
}
