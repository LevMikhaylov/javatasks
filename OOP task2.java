package ru.ithub.javatrain;
import java.util.Arrays;
class Person {
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public void updateAge(){
        ++age;
    }
    public void updateName(String newName){
        this.name = newName;
    }
}
class Worker extends Person{
    private double salary;
    public Worker(String name,int age, String gender,double salary){
        super(name,age,gender);
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
}
class Manager extends Worker{
    private Worker[]workers;
    public Manager(String name,int age, String gender,double salary,Worker[]workers){
        super(name,age,gender,salary);
        workers = new Worker[0];
    }
    public void addWorker(String name,int age,String gender,double salary){
        if(workers == null){
            workers = new Worker[1];
            workers[0] = new Worker(name,age,gender,salary);
        }
        else{
            workers = Arrays.copyOf(workers,workers.length+1);
            workers[workers.length-1] = new Worker(name,age,gender,salary);
        }
    }
    public void getWorkers(){
        for(Worker worker:workers){
            System.out.println("Имя: "+worker.getName()+"\n"+"Возраст: "+worker.getAge()+"\n"+"Пол"+worker.getGender()+"\n"+"Зарплата: "+worker.getSalary()+"\n");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ринго Старр",23,"Мужчина");
        System.out.println("Имя: "+person.getName()+"\n"+"Возраст: "+person.getAge()+"\n"+"Пол: "+person.getGender()+"\n");
        person.updateAge();
        System.out.println("Имя: "+person.getName()+"\n"+"Возраст: "+person.getAge()+"\n"+"Пол: "+person.getGender()+"\n");
        person.updateName("Пол Маккартни");
        System.out.println("Имя: "+person.getName()+"\n"+"Возраст: "+person.getAge()+"\n"+"Пол: "+person.getGender()+"\n");
        Worker worker = new Worker("Иванов Иван",18,"Мужчина",123000);
        System.out.println("Имя: "+worker.getName()+"\n"+"Возраст: "+worker.getAge()+"\n"+"Пол: "+worker.getGender()+"\n"+"Зарплата: "+worker.getSalary()+"\n");
        Manager manager = new Manager("Иванов Иван",19,"Мужчина",123000,new Worker[0]);
        manager.addWorker("Петрв Пётр", 19,"мужчина",34000);
        manager.addWorker("Иванова Дарья", 19,"женщина",34000);
        manager.addWorker("Мария Ивановна", 20,"Женщина",124000);
        manager.getWorkers();
    }
}
