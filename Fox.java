package org.island;

import java.util.Random;

public class Fox extends Carnivore{
    private final int wegth;
    public Fox(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Fox", health, hunger, reproductionChance, x, y);
        this.wegth=8;
    }
    @Override
    public void eat(Animal prev){
        Random random = new Random();
        int chance = random.nextInt(100);
        if(chance == 70 && prev instanceof Rabbit){
            System.out.println(this.name+" ate "+"rabbit");
            prev.health=0;
            --hunger;

        }
        else if(chance == 90 && prev instanceof Mouse){
            System.out.println(this.name+" ate "+"mouse");
            prev.health=0;
            --hunger;
        }
        else if(chance == 60 && prev instanceof Duck){
            System.out.println(this.name+" ate "+"duck");
            prev.health=0;
            --hunger;
        }
        else if(chance == 40 && prev instanceof Caterpillar){
            System.out.println(this.name+" ate "+"caterpillar");
            prev.health=0;
            --hunger;
        }
        if(hunger == 0){
            System.out.println("Я сыта");
        }
    }
}
