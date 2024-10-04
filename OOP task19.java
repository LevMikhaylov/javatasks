package ru.ithub.javatrain;
// Базовый класс Device
class Device {
    private String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void turnOn() {
        System.out.println(brand + " device is now ON.");
    }

    public void turnOff() {
        System.out.println(brand + " device is now OFF.");
    }
}

// Класс Smartphone, наследующий от Device
class Smartphone extends Device {
    
    public Smartphone(String brand) {
        super(brand);
    }

    public void takePhoto() {
        System.out.println(getBrand() + " is taking a photo.");
    }
}

// Класс Laptop, наследующий от Device
class Laptop extends Device {
    
    public Laptop(String brand) {
        super(brand);
    }

    public void code() {
        System.out.println(getBrand() + " is coding.");
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Apple");
        smartphone.turnOn();
        smartphone.takePhoto();
        smartphone.turnOff();

        Laptop laptop = new Laptop("Dell");
        laptop.turnOn();
        laptop.code();
        laptop.turnOff();
    }
}
