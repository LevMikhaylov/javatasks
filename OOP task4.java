package ru.ithub.javatrain;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
abstract class Transport {
    public abstract void move();
}
class Car extends Transport{
    private String brand;
    private String color;
    private String govnum;
    public Car(String brand, String color, String govnum) throws IllegalArgumentException{
        this.brand=brand;
        this.color=color;
        if(validateGovnum(govnum)){
            this.govnum=govnum;
        }
        else{
            throw new IllegalArgumentException("Невергый формат госномера!");
        }
    }
    @Override
    public void move() {
        System.out.println("Машина: "+brand+" "+color+" "+govnum+" "+"едет");
    }
    private boolean validateGovnum(String govnum){
        Pattern pattern = Pattern.compile("[АВЕКМНОРСТУХ]\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}RUS");
        Matcher matcher = pattern.matcher(govnum);;
        return matcher.matches();
    }
}
class Bike extends Transport{
    @Override
    public void move(){
        System.out.println("Велосипед едет");
    }
}
public class Main {
    public static void main(String[]args){
        try {
            Car car = new Car("Mercedes-Benz Sprinter 411CDI", "белый", "А123УУ77RUS");
            Car car1 = new Car("Audi e-tron", "белый", "О101УА77RUS");
            Car car2 = new Car("Audi e-tron", "белый", "О102УХ77RUS");
            Bike bike = new Bike();
            car.move();
            car2.move();
            car1.move();
            bike.move();;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());;
        }
    }
}
