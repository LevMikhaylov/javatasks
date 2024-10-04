class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
class Rectangle1 {
    private Point topLeft;    
    private Point bottomRight; 
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public double area() {
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY();
        return width * height; // площадь
    }
}
public class Main {
    public static void main(String[] args) {
        Point topLeft = new Point(1, 4);
        Point bottomRight = new Point(5, 1);
        Rectangle1 rectangle = new Rectangle1(topLeft, bottomRight);

        double area = rectangle.area();
        System.out.println("Площадь прямоугольника: " + area);
    }
}
