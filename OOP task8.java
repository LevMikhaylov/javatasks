package ru.ithub.javatrain;
abstract class Shape {
    public abstract double getArea();
}
class Rectangle extends Shape{
    private double w;
    private double h;
    public Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public double getArea() {
        return w*h;
    }
}
public class Circle extends Shape{
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        return Math.PI*Math.pow(r,2);
    }
}
public class Main {
    public static void main(String[]args) {
        Rectangle r = new Rectangle(5,6);
        Circle c = new Circle(4);
        System.out.println(r.getArea());
        System.out.println(c.getArea());
    }
}
