class UniqueID {
    private static int currentID = 0;
    public static int generateID() {
        return ++currentID; 
    }
}
class MyClass {
    private final int uniqueID; 
    public MyClass() {
        this.uniqueID = UniqueID.generateID(); 
    }
    public int getUniqueID() {
        return uniqueID; 
    }
}
public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        System.out.println("Уникальный идентификатор объекта 1: " + obj1.getUniqueID());
        System.out.println("Уникальный идентификатор объекта 2: " + obj2.getUniqueID());
        System.out.println("Уникальный идентификатор объекта 3: " + obj3.getUniqueID());
    }
}
