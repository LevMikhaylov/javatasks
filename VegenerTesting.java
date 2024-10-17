package ru.ithub.javatrainj;
import java.util.*;
public class lol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VigenereEncrypter ve = new VigenereEncrypter();
        VigenereDecrypyer vd = new VigenereDecrypyer();
        int point;
        do{
            System.out.println("Введите пункт меню");
            System.out.println("Меню"+"\n"+"1. Шифрование"+"\n"+"2. Расшифровка"+"\n"+"3. Выход");
            point = sc.nextInt();
            switch (point){
                case 1:
                    System.out.println("Введите текст для шифрования");
                    String plaintext = sc.next();
                    System.out.println("Введите ключ");
                    String key = sc.next();
                    String ciphertext = ve.encrypt(plaintext, key);
                    System.out.println("Зашифрованный текст: "+ciphertext);
                    break;
                case 2:
                    System.out.println("Введите текст для расшифровки");
                    String plaintext1 = sc.next();
                    System.out.println("Введите ключ");
                    String key1 = sc.next();
                    String ciphertext1 = vd.decrypt(plaintext1, key1);
                    System.out.println("Расшифрованный текст: "+ciphertext1);
                    break;
                case 3:
                    System.out.println("Вы вышли");
                    break;
                default:
                    System.out.println("Повторите,пожалуйта,ввод.");
                    break;
            }
        }while(point != 3);
    }
    }
