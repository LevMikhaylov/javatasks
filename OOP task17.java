package ru.ithub.javatrain;
class Player {
    private String name;
    private int health;
    private Weapon weapon;

    public Player(String name) {
        this.name = name;
        this.health = 100; // Начальное здоровье игрока
        this.weapon = null; // Игрок может начать без оружия
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " equipped " + weapon.getName());
    }

    public void attack(Enemy enemy) {
        if (weapon != null) {
            System.out.println(name + " attacks " + enemy.getName() + " with " + weapon.getName());
            enemy.takeDamage(weapon.getDamage());
        } else {
            System.out.println(name + " attacks " + enemy.getName() + " with bare hands!");
            enemy.takeDamage(5); // Урон без оружия
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Health now: " + health);
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }

    public String getName() {
        return name;
    }
}
class Enemy {
    private String name;
    private int health;

    public Enemy(String name) {
        this.name = name;
        this.health = 50; // Начальное здоровье врага
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Health now: " + health);
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }

    public String getName() {
        return name;
    }
}
class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
public class Main{
    public static void main(String[] args) {
        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Goblin");
        Weapon sword = new Weapon("Sword", 15);

        player.equipWeapon(sword);
        player.attack(enemy);
        enemy.takeDamage(5); // Если нужно нанести дополнительный урон врагу
    }
}
