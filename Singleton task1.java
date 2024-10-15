package ru.ithub.javatrainj;
public class lol {
    private static lol instance;
    private lol(){}
    public static lol getInstance() {
        if (instance == null) {
            instance = new lol();
            System.out.println("Создано новое подключение к базе данных.");
        }
        return instance;
    }
    public void connect() {
        System.out.println("Подключение к базе данных успешно выполнено.");
    }
    public static void main(String[] args) {
        lol connection1 = lol.getInstance();
        connection1.connect();

        lol connection2 = lol.getInstance();
        connection2.connect();

        // Проверка на равенство двух ссылок
        System.out.println("connection1 и connection2 ссылаются на один и тот же объект? " + (connection1 == connection2));
    }
}
