package org.example;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Car>cars;
    public Parking() {
        this.cars = new ArrayList<>();
    }
    public void parkCar(Car car) throws CarExistingException{
        for(Car c:cars){
            if(c.getModel().equals(car.getModel())&&c.getColor().equals(car.getColor())&&c.getGovnum().equals(car.getGovnum())){
                throw new CarExistingException("Такая машина уже припаркована!");
            }
        }
        cars.add(car);
    }
    public void removeCar(String govnum){
        cars.removeIf(car -> car.getGovnum().equals(govnum));
    }
    public ArrayList<Car> getCars() {
        return cars;
    }
}
