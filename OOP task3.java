package ru.ithub.javatrain;
interface Animal {
    void makeSound();
}
class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Гав Гав");
    }
}
class Cat implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Мяу");
    }
}
public class Cow implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Муууу");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal[]animals=new Animal[3];
        animals[0] = new Dog();
        animals[1]=new Cat();
        animals[2]=new Cow();
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
