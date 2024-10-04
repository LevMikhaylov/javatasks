package ru.ithub.javatrain;
import java.util.ArrayList;
import java.util.List;
class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
class Customer {
    private String id;
    private String name;
    private List<Order> orders;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class Order {
    private static int orderIdCounter = 0;
    private int orderId;
    private List<Product> products;

    public Order() {
        this.orderId = ++orderIdCounter;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }
}
public class Main {
    public static void main(String[] args) {
        // Создаем продукты
        Product product1 = new Product("1", "Лампа", 150.00);
        Product product2 = new Product("2", "Стол", 350.00);
        
        // Создаем клиента
        Customer customer = new Customer("1", "Алексей");

        // Создаем заказ
        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);
        
        // Добавляем заказ к клиенту
        customer.addOrder(order);

        // Выводим информацию о заказе
        System.out.println("Заказ ID: " + order.getOrderId());
        System.out.println("Общая стоимость заказа: " + order.getTotalCost());
        System.out.println("Продукты в заказе:");
        for (Product product : order.getProducts()) {
            System.out.println("- " + product.getName() + ": " + product.getPrice());
        }

        // Просмотр истории заказов клиента
        System.out.println("История заказов клиента: " + customer.getName());
        for (Order o : customer.getOrders()) {
            System.out.println("Заказ ID: " + o.getOrderId() + ", Общая стоимость: " + o.getTotalCost());
        }
    }
}
