import java.util.ArrayList;
import java.util.List;
class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
class Store {
    private List<Product> productList;
    public Store() {
        this.productList = new ArrayList<>();
    }
    public void addProduct(Product product) {
        productList.add(product);
    }
    public void removeProduct(String productName) {
        productList.removeIf(product -> product.getName().equalsIgnoreCase(productName));
    }
    public Product findProductByName(String productName) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null; // Возвращает null, если продукт не найден
    }
    public List<Product> getProducts() {
        return productList;
    }
    @Override
    public String toString() {
        return "Store{" +
                "productList=" + productList +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product apple = new Product("Apple", 1.0, 100);
        Product banana = new Product("Banana", 0.5, 150);
        Product orange = new Product("Orange", 0.8, 200);
        store.addProduct(apple);
        store.addProduct(banana);
        store.addProduct(orange);
        System.out.println("Products in store: ");
        System.out.println(store);
        System.out.println("Finding product 'Apple': " + store.findProductByName("Apple"));
        store.removeProduct("Banana");
        System.out.println("Products after removing 'Banana': ");
        System.out.println(store);
    }
}
