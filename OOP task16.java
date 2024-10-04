package ru.ithub.javatrain;
class Matrix {
    private final int[][] data;

    // Конструктор для создания матрицы заданного размера
    public Matrix(int rows, int cols) {
        data = new int[rows][cols];
    }

    // Метод для установки значения в конкретной ячейке
    public void set(int row, int col, int value) {
        data[row][col] = value;
    }

    // Метод для получения значения из конкретной ячейки
    public int get(int row, int col) {
        return data[row][col];
    }

    // Метод для сложения двух матриц
    public Matrix add(Matrix other) {
        if (this.data.length != other.data.length || this.data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        Matrix result = new Matrix(this.data.length, this.data[0].length);
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                result.set(i, j, this.get(i, j) + other.get(i, j));
            }
        }
        return result;
    }

    // Перегрузка метода сложения для сложения матрицы и скаляра
    public Matrix add(int scalar) {
        Matrix result = new Matrix(this.data.length, this.data[0].length);
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                result.set(i, j, this.get(i, j) + scalar);
            }
        }
        return result;
    }

    // Метод для умножения двух матриц
    public Matrix multiply(Matrix other) {
        if (this.data[0].length != other.data.length) {
            throw new IllegalArgumentException("Matrix multiplication not possible");
        }

        Matrix result = new Matrix(this.data.length, other.data[0].length);
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < other.data[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < this.data[0].length; k++) {
                    sum += this.get(i, k) * other.get(k, j);
                }
                result.set(i, j, sum);
            }
        }
        return result;
    }

    // Перегрузка метода умножения для умножения на скаляр
    public Matrix multiply(int scalar) {
        Matrix result = new Matrix(this.data.length, this.data[0].length);
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                result.set(i, j, this.get(i, j) * scalar);
            }
        }
        return result;
    }

    // Метод для отображения матрицы
    public void display() {
        for (int[] row : data) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);
        Matrix matrix2 = new Matrix(2, 2);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);
        System.out.println("Matrix 1:");
        matrix1.display();
        System.out.println("Matrix 2:");
        matrix2.display();
        Matrix sum = matrix1.add(matrix2);
        System.out.println("Sum of Matrix 1 and Matrix 2:");
        sum.display();
        Matrix product = matrix1.multiply(matrix2);
        System.out.println("Product of Matrix 1 and Matrix 2:");
        product.display();
        Matrix scalarSum = matrix1.add(10);
        System.out.println("Matrix 1 after adding scalar 10:");
        scalarSum.display();
        Matrix scalarProduct = matrix1.multiply(2);
        System.out.println("Matrix 1 after multiplying by scalar 2:");
        scalarProduct.display();
    }
}
