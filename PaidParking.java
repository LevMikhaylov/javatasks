package org.example;

import java.util.Scanner;

public class PaidParking extends Parking{
    private double tarif;
    private boolean isPaid;
    public PaidParking(double tarif) {
        super();
        this.tarif = tarif;
        this.isPaid = false;
    }
    @Override
    public void parkCar(Car car) throws CarExistingException{
        super.parkCar(car);
        Scanner s = new Scanner(System.in);
        System.out.println("На сколько часов хотите оплатить парковку?");
        int hours = s.nextInt();
        Thread inputTread = new Thread(()-> {
            try{
            Card card = new Card(5600.00);
            double totalCost = tarif * hours;
            card.pay(totalCost);
            isPaid=true;
            System.out.println("Вы успешно оплатили парковку на "+hours+"час(ов)");
        } catch (LessMoneyException e) {
                System.out.println(e.getMessage());;
            }
            try {
                Thread.sleep(hours* 3600000L);
                removeCar(car.getGovnum());
                System.out.println("Парковка завершена. Машини с номером "+car.getGovnum()+" уехала");

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());;
            }
        });
        inputTread.start();
        try{
            Thread.sleep(300000);
            if(!isPaid){
                System.out.println("Вам выдан щтраф за неоплату парковки 5000 руб.");
                inputTread.interrupt();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());;
        }
    }
}
