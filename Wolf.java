package org.island;

import java.util.Random;

public class Wolf extends Carnivore{
    private final int weight;
    public Wolf(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Wolf", health, hunger, reproductionChance, x, y);
        this.weight=50;
    }
    @Override
    public void eat(Animal prev){
        Random random = new Random();
        int chance = random.nextInt(100);
        if(chance == 10 && prev instanceof Horse){
            System.out.println(this.name+" ate "+"horse");
            --hunger;
            prev.health=0;

        }
        else if(chance == 15 && prev instanceof Deer){
            System.out.println(this.name+" ate "+"deer");
            prev.health=0;
            --hunger;
        }
        else if(chance == 60 && prev instanceof Rabbit){
            System.out.println(this.name+" ate "+"rabbit");
            prev.health=0;
            --hunger;

        }
        else if(chance == 80 && prev instanceof Mouse){
            System.out.println(this.name+" ate "+"mouse");
            prev.health=0;
            --hunger;
        }
        else if(chance == 60 && prev instanceof Goat){
            System.out.println(this.name+" ate "+"goat");
            prev.health=0;
            --hunger;
        }
        else if(chance == 70 && prev instanceof Sheep){
            System.out.println(this.name+" ate "+"sheep");
            prev.health=0;
            --hunger;
        }
        else if(chance == 15 && prev instanceof Hog){
            System.out.println(this.name+" ate "+"hog");
            prev.health=0;
            --hunger;
        }
        else if(chance == 10 && prev instanceof Bull){
            System.out.println(this.name+" ate "+"bull");
            prev.health=0;
            --hunger;
        }
        else if(chance == 40 && prev instanceof Duck){
            System.out.println(this.name+" ate "+"duck");
            prev.health=0;
            --hunger;
        }
        if(hunger == 0){
            System.out.println("Я сыт");
        }
    }
}
