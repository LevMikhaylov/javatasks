package ru.ithub.javatrain;
class Animal1 {
    public void move(){
        System.out.println("Животное движется");
    }
}
class Fish extends Animal1{
    @Override
    public void move(){
        System.out.println("Рыба плавает");
    }
}
class Bird extends Animal1{
    @Override
    public void move(){
        System.out.println("Птица летает");
    }
}
public class Main {
    public static void main(String[]args) {
        Animal1 animal = new Animal1();
        Fish fish = new Fish();
        Dog1 dog = new Dog1();
        Bird bird = new Bird();
        animal.move();
        fish.move();
        bird.move();
        dog.move();
    }
}
