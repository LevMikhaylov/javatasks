class ComplexNumber {
    private double real; // Действительная часть
    private double imaginary; // Мнимая часть
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }
    public ComplexNumber divide(ComplexNumber other) throws ArithmeticException{
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Переопределяем метод toString для удобства вывода
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}
public class Main{
      public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, -5);
      try{
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("Сложение: " + c1.add(c2));
        System.out.println("Вычитание: " + c1.subtract(c2));
        System.out.println("Умножение: " + c1.multiply(c2));
        System.out.println("Деление: " + c1.divide(c2));
      }catch(ArithmeticException e){
        System.out.println(e.getMessage());
      }
    }
}
