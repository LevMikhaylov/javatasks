package org.island;

import java.util.Random;

public class Snake extends Carnivore{
    private final int weight;
    public Snake(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Snake", health, hunger, reproductionChance, x, y);
        this.weight=15;
    }
    @Override
    public void eat(Animal prev){
        Random random = new Random();
        int chance = random.nextInt(100);
        if(chance == 15 && prev instanceof Fox){
            System.out.println(this.name+" ate "+"fox");
            prev.health=0;
            --hunger;

        }
        else if(chance == 20 && prev instanceof Rabbit){
            System.out.println(this.name+" ate "+"rabbit");
            prev.health=0;
            --hunger;

        }
        else if(chance == 40 && prev instanceof Mouse){
            System.out.println(this.name+" ate "+"mouse");
            prev.health=0;
            --hunger;
        }
        else if(chance == 10 && prev instanceof Duck){
            System.out.println(this.name+" ate "+"duck");
            prev.health=0;
            --hunger;
        }
        if(hunger == 0){
            System.out.println("Я сыта");
        }
    }
}
