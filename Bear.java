package org.island;

import java.util.Random;

public class Bear extends Carnivore{
    private final int weigth;
    public Bear(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Bear", health, hunger, reproductionChance, x, y);
        this.weigth=500;
    }
    @Override
    public void eat(Animal prev){
        Random random = new Random();
        int chance = random.nextInt(100);
        if(chance == 40 && prev instanceof Horse){
            System.out.println(this.name+" ate "+"horse");
            prev.health=0;

        }
        else if(chance == 80 && prev instanceof Snake){
            System.out.println(this.name+" ate "+"snake");
            prev.health=0;
        }
        else if(chance == 80 && prev instanceof Deer){
            System.out.println(this.name+" ate "+"deer");
            prev.health=0;
        }
        else if(chance == 80 && prev instanceof Rabbit){
            System.out.println(this.name+" ate "+"rabbit");
            prev.health=0;

        }
        else if(chance == 10 && prev instanceof Duck){
            System.out.println(this.name+" ate "+"duck");
            prev.health=0;
        }
        else if(chance == 90 && prev instanceof Mouse){
            System.out.println(this.name+" ate "+"mouse");
            prev.health=0;
        }
        else if(chance == 70 && prev instanceof Goat){
            System.out.println(this.name+" ate "+"goat");
            prev.health=0;
        }
        else if(chance == 70 && prev instanceof Sheep){
            System.out.println(this.name+" ate "+"sheep");
            prev.health=0;
        }
        else if(chance == 50 && prev instanceof Hog){
            System.out.println(this.name+" ate "+"hog");
            prev.health=0;
        }
        else if(chance == 20 && prev instanceof Bull){
            System.out.println(this.name+" ate "+"bill");
            prev.health=0;
        }
    }
}
