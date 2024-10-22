package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private String model;
    private String color;
    private String govnum;
    private boolean checkGovNum(String govnum){
        Pattern rexex = Pattern.compile("[АВЕКМНОРСТУХ]\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}");
        Matcher m = rexex.matcher(govnum);
        return m.matches();
    }
    public Car(String model, String color, String govnum) throws IllegalArgumentException{
        this.model = model;
        this.color = color;
        if(checkGovNum(govnum)) {
            this.govnum = govnum;
        }else{
            throw new IllegalArgumentException("Неверный формат государственного номера");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGovnum() {
        return govnum;
    }

    public void setGovnum(String govnum) throws IllegalArgumentException{
        if(checkGovNum(govnum)) {
            this.govnum = govnum;
        }else{
            throw new IllegalArgumentException("Неверный формат государственного номера");
        }
    }
}
