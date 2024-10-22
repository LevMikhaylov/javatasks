package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Parking p = new PaidParking(480);
        int point;
        do{
            point = s.nextInt();
            System.out.println("Меню"+"\n"+"1. Парковать машину"+"\n"+"2. Показать машины"+"\n"+"3. Выход");
            switch(point){
                case 1:
                    System.out.println("Введите модель машины");
                    String model = s.next();
                    System.out.println("Введите цвет машины");
                    String color = s.next();
                    System.out.println("Введите гос.номер машины");
                    String govnum = s.next();
                    try {
                        p.parkCar(new Car(model, color, govnum));
                    } catch (CarExistingException e) {
                        System.out.println(e.getMessage());;
                    }
                    break;
                case 2:
                    ArrayList<Car>cars = p.getCars();
                    for(Car car:cars){
                        System.out.println(car.getModel()+" "+car.getColor()+" "+car.getGovnum());
                    }
                    break;
                case 3:
                    System.out.println("Вы вышли из приложения");
                    break;
            }
        }while(point != 3);
    }
}
