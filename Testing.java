package ru.ithub.javatrainj;
public class lol {
    public static void main(String[] args) {
        Order order = new Order();

        // Проверка начального статуса
        System.out.println(order);

        // Изменяем статус на IN_PROGRESS
        order.setStatus(OrderStatus.IN_PROGRESS);
        System.out.println(order);

        // Сменяем статус на DELIVERED
        order.setStatus(OrderStatus.DELIVERED);
        System.out.println(order);

        // Попытка отмены доставленного заказа
        try {
            order.setStatus(OrderStatus.CANCELLED);
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


        order = new Order();
        order.setStatus(OrderStatus.IN_PROGRESS);


        order.setStatus(OrderStatus.CANCELLED);
        System.out.println(order);
    }
    }
